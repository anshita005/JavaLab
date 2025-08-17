package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;


public class Prepared_Strategy_methods {



		public static void main(String[] args) {
        
	         ChromeOptions chromeOptions = new ChromeOptions();
	         chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	         WebDriver driver = new ChromeDriver(chromeOptions);
	         try {
	         driver.get("https://www.google.com");
	         }
	         catch(Exception e) {
	        	 e.printStackTrace();
	         }
	         finally {
	        	 driver.close();
	         }


		}

		
	}
