package pages;

import helper.HookHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage
{
    private WebDriver webDriver;
    private WebElement searchRegister;


    @FindBy(className = "fb-masthead-login")
    private WebElement loginDiv;



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


/*

//*[@id='typhead-suggestions']//a


 */
}