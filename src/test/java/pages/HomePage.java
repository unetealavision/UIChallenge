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


public class HomePage extends BasePage
{
    private WebDriver webDriver;





    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }





/*

//*[@id='typhead-suggestions']//a


 */
}