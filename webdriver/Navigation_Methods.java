package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Capabilities;


public class Navigation_Methods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com");
        
        driver.navigate().to("https://360homedecor.uk/");
        
        Thread.sleep(3000);
        driver.navigate().back();
     
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        

        System.out.println("Page Source: " + driver.getPageSource());
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());

        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

        // Get browser name and version
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getBrowserVersion();

        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);
      
        
        driver.quit();
    }
}
