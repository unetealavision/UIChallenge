package helper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerHelper {
    protected WebDriver webDriver;

    @Before

    public void setUp()
    {
        webDriver = new ChromeDriver();
        webDriver
                .get("https://www.wikipedia.org");
        webDriver
                .manage().window().fullscreen();
    }

    @After
    public void tearDown()
    {
        webDriver.quit();
    }

}