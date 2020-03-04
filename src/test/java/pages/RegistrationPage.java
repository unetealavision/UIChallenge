package pages;

import helper.HookHelper;
import org.awaitility.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static org.awaitility.Awaitility.await;


public class RegistrationPage extends BasePage {
    private WebDriver webDriver;
    private WebElement searchRegister, genderRadioButton;
    private Select dropDownCountry, dropdownDocument,
            dropDownDay, dropDownMonth, dropDownYear;


    @FindBy(className = "fb-masthead-login")
    private WebElement loginDiv;

    @FindBy(id = "user")
    private WebElement user;

    @FindBy(id = "apellidopaterno")
    private WebElement fatherLastName;

    @FindBy(id = "apellidomaterno")
    private WebElement motherLastName;

    @FindBy(id = "mail")
    private WebElement mail;

    @FindBy(id = "clave1")
    private WebElement password;

    @FindBy(id = "clave2")
    private WebElement confirmPass;

    @FindBy(id = "cedula_colombia")
    private WebElement documentNum;


    private WebElement termsCheckbox;
    private WebElement saveButton;
    private WebElement findCellhponeAlert;

    private By chanSelector = By.xpath("sfdsdfsdf");


    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }



    public void searchRegister ()
    {
        loginDiv.click();
        WebDriverWait wait = new WebDriverWait(webDriver,Long.parseLong("5"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Modal__modalcontent__2yJz6")));
        searchRegister = webDriver.findElement(By.className("Login__createAccount__38c2o")).findElement(By.tagName("a"));
        searchRegister.click();
    }


    public void insertData() {
        WebDriverWait wait = new WebDriverWait(webDriver, Long.parseLong("5"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contRegistro")));
        user.click();
        user.clear();
        user.sendKeys("CARLOS");
        fatherLastName.click();
        fatherLastName.clear();
        fatherLastName.sendKeys("VAZQUEZ");
        motherLastName.click();
        motherLastName.clear();
        motherLastName.sendKeys("PEREZ");
        mail.click();
        mail.clear();
        mail.sendKeys("igmirsedarcom@sarasotaluxuryagent.com");
        password.click();
        password.clear();
        password.sendKeys("sD4eMa9TKtsFdJGs");
        confirmPass.click();
        confirmPass.clear();
        confirmPass.sendKeys("sD4eMa9TKtsFdJGs");
        dropDownCountry = new Select(webDriver.findElement(By.id("status")));
        dropDownCountry.selectByVisibleText("Colombia");
        dropdownDocument = new Select(webDriver.findElement(By.id("cedula")));
        dropdownDocument.selectByValue("CEDULA_DE_CIUDADANIA");
        documentNum.click();
        documentNum.clear();
        documentNum.sendKeys("1016948235");
        genderRadioButton = webDriver.findElement(By.xpath("//*[@id='tipodireccion_0' and @value='male']"));
        genderRadioButton.click();
        dropDownDay = new Select(webDriver.findElement(By.id("day")));
        dropDownDay.selectByVisibleText("5");
        dropDownMonth = new Select(webDriver.findElement(By.id("month")));
        dropDownMonth.selectByVisibleText("May");
        dropDownYear = new Select(webDriver.findElement(By.id("year")));
        dropDownYear.selectByVisibleText("1990");
        //this.offersCheckbox = offersCheckbox.findElement(By.xpath("//*[@name='/atg/userprofiling/ProfileFormHandler.editValue.receiveEmail']"));
        //offersCheckbox.click();
        //this.termsCheckbox = webDriver.findElement(By.xpath("//*[contains(text(), 'Quiero')]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreelegaleId")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("agreelegaleId")));
        termsCheckbox = webDriver.findElement(By.id("agreelegaleId"));
        await().atMost(Duration.TEN_SECONDS)
                .pollInterval(Duration.ONE_SECOND)
                .until(() -> {
                            termsCheckbox.click();
                            return termsCheckbox.isSelected();
                        }
                );
        //saveButton = webDriver.findElement(By.id("boton_Ar"));
        //saveButton.click();
    }

    public void saveButtonClick() {
        saveButton = webDriver.findElement(By.id("boton_Ar"));
        saveButton.click();
    }

    public String registCellphoneNotFound() {

        String cellphoneEmptyMessage = "false";
        
        this.findCellhponeAlert = webDriver.findElement(By.id("mensajeCelVacio"));
        if(findCellhponeAlert.isDisplayed())
        {
            cellphoneEmptyMessage = "true";
            
        }
        return cellphoneEmptyMessage;
        

    }
}
