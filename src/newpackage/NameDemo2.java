package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameDemo2 {

public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\geckodriver-v0.30.0-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
    driver.get("http://demo.guru99.com/test/ajax.html");
    //findElements tìm theo 1 tiêu chí nào đó, rồi trả về danh sách các phần tử thỏa
    // nếu ko có thì trả về danh sách trống
    List<WebElement> elements = driver.findElements(By.name("name"));
    System.out.println("Number of elements:" +elements.size());

    for (int i=0; i<elements.size();i++){
      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
    }
  }
}
