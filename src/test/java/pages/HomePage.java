package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HomePage extends BasePage
{
    @FindBy(id = "searchInput")
    private WebElement searchBox;

    private WebDriver webDriver;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver=webDriver;
    }

    public ArticlePage search(String query)
    {
        searchBox.click();;
        searchBox.clear();
        searchBox.sendKeys(query);
        WebDriverWait wait = new WebDriverWait(webDriver,Long.parseLong("5"));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='typeahead-suggestions']//a"),1));
        List<WebElement> results = webDriver.findElement(By.id("typeahead-suggestions")).findElements(By.tagName("a"));
        results.get(0).click();

        return new ArticlePage(webDriver);
    }
/*

//*[@id='typhead-suggestions']//a


 */
}