package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class GoogleSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.submit();

 
            Thread.sleep(20000);

            List<WebElement> results = driver.findElements(By.cssSelector("h3"));

            for (WebElement result : results) {
                System.out.println(result.getText());
            }

            if (!results.isEmpty()) {
                System.out.println("\nOpening first result: " + results.get(0).getText());
                results.get(0).click();

                Thread.sleep(20000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
