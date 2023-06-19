package textBoxWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://primusbank.qedgetech.com/");
	WebElement contain=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]"));
	String containy=contain.getText();
	System.out.println(contain);
	System.out.println(containy);
	driver.close();
}
}
