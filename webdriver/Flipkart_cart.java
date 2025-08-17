package webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_cart {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src/config.properties");
        props.load(fis);

        String number = props.getProperty("flipkart.mobilenumber");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        // Login process
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys(number);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();

     
        Thread.sleep(10000);


        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("laptop");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(3000);

        WebElement firstProduct = driver.findElement(By.className("_75nlfW"));
        firstProduct.click();
        Thread.sleep(3000);

        // Add to cart
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
