package newpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

public class Image {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://vnexpress.net/the-thao";					
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\geckodriver-v0.30.0-win32\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();					
        		
        driver.get(baseUrl);					
        //click on the "Facebook" logo on the upper left portion	
        // phải dựa trên title của cái class đó
			driver.findElement(By.cssSelector("a[title=\"VnExpress - Báo tiếng Việt nhiều người xem nhất\"]")).click();					

			//verify that we are now back on Facebook's homepage		
			if (driver.getTitle().equals("VnExpress - Báo tiếng Việt nhiều người xem nhất")) {							
            System.out.println("We are back at Vnexpress's homepage");					
        } else {			
            System.out.println("We are NOT in Vnexpress's homepage");					
        }		
				//driver.close();		

    }		
}