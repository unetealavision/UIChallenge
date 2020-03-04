package pages;

import helper.HookHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage
{
    private WebDriver webDriver;
    private WebElement searchRegister, radioButton;


    @FindBy(className = "fb-masthead-login")
    private WebElement loginDiv;

    @FindBy(id = "user")
    private WebElement user;

    @FindBy(id ="apellidopaterno")
    private WebElement fatherLastName;

    @FindBy(id ="apellidomaterno")
    private WebElement motherLastName;

    @FindBy(id ="mail")
    private WebElement mail;

    @FindBy(id ="clave1")
    private WebElement password;

    @FindBy(id ="clave2")
    private WebElement confirmPass;

    @FindBy(id ="cedula_colombia")
    private WebElement documentNum;


    public HomePage(WebDriver webDriver) {
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

    public void insertData()
    {
        WebDriverWait wait = new WebDriverWait(webDriver,Long.parseLong("5"));
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
        mail.sendKeys("gmireil@jessietv.tokyo");
        password.click();
        password.clear();
        password.sendKeys("sD4eMa9TKtsFdJGs");
        confirmPass.click();
        confirmPass.clear();
        confirmPass.sendKeys("sD4eMa9TKtsFdJGs");
        Select dropDownCountry = new Select(webDriver.findElement(By.id("status")));
        dropDownCountry.selectByVisibleText("Colombia");
        Select dropdownDocument = new Select(webDriver.findElement(By.id("cedula")));
        dropdownDocument.selectByVisibleText("Cédula de ciudadanía");
        documentNum.click();
        documentNum.clear();
        documentNum.sendKeys("1016948235");
        radioButton.findElement(By.xpath("//input[@value='male']"));

    }


/*

//*[@id='typhead-suggestions']//a


 */
}