package helper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerHelper {
    private WebDriver webDriver;

    @Before

    public void setUp()
    {
        webDriver = new ChromeDriver();
        webDriver
                .get("www.wikipedia.org");
        webDriver
                .manage().window().fullscreen();
    }

    @After
    public void tearDown()
    {
        
    }

}