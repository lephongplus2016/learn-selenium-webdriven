package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\geckodriver-v0.30.0-win32\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();

driver.get("http://demo.guru99.com/test/ajax.html");

// Find the radio button for “No” using its ID and click on it
driver.findElement(By.id("no")).click();
	
//Click on Check Button
driver.findElement(By.id("buttoncheck")).click();

}

}
