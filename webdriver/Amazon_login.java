package webdriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

    public static void main(String[] args) throws InterruptedException, IOException {
        
    	Properties props = new Properties();
	    FileInputStream fis = new FileInputStream("config.properties");
	    props.load(fis);

	    String number = props.getProperty("amazon.mobilenumber");
	    String password = props.getProperty("email.password");
    	
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("ap_email_login")).sendKeys(number);
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(1000);
	     
	    driver.findElement(By.id("ap_password")).sendKeys(password);
	    driver.findElement(By.id("signInSubmit")).click();
	    Thread.sleep(1000);
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);

        WebElement firstProduct = driver.findElement(By.cssSelector("div.s-main-slot div[data-index='1'] h2 a"));
        firstProduct.click();
        Thread.sleep(3000);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        driver.findElement(By.id("add-to-wishlist-button-submit")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}