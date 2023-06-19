package textBoxWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://flights.qedgetech.com/");
	driver.findElement(By.linkText("Register")).click();
	WebElement chkbox=driver.findElement(By.xpath("//input[@id='flexCheckChecked']"));
	if(!chkbox.isSelected()) {
		chkbox.click();
	}
}
}
