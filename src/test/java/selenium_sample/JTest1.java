package selenium_sample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class JTest1 {
    @Test
    public void startWebDriver(){

        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
    }
}