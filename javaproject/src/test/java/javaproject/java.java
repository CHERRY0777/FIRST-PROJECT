package javaproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class java {
	
	 public static void main(String[] args) {
	        // Set the path to the ChromeDriver (Adjust the path to where you have saved your driver)
		 //System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Initialize WebDriver (for Chrome)
	        WebDriver driver = new ChromeDriver();
	        
	        // Navigate to the desired website
	        driver.get("https://www.credosystemz.com/hcl-selenium-interview-questions/");

	        // Optional: Maximize the browser window
	        driver.manage().window().maximize();

	        // Wait for a while to see the open browser (Optional)
	        try {
	            Thread.sleep(5000);  // 5 seconds sleep
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


