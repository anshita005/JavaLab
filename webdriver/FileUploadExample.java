package webdriver;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.naukri.com/nlogin/login");
            driver.findElement(By.id("usernameField")).sendKeys("anshitasharma2002@gmail.com");
            driver.findElement(By.id("passwordField")).sendKeys("Avenger@21");
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            Thread.sleep(5000);
            driver.get("https://www.naukri.com/mnjuser/profile");
            Thread.sleep(2000);


            File uploadFile = new File("C:\\Users\\anshi\\Desktop\\New_Anshita_Resume.pdf");
            WebElement fileInput = driver.findElement(By.id("attachCV"));

            fileInput.sendKeys(uploadFile.getAbsolutePath());

            Thread.sleep(3000);

           
            System.out.println("Uploaded Sucessfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
