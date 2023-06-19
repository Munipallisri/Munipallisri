package textBoxWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://flights.qedgetech.com/");
	driver.findElement(By.linkText("Register")).click();
//	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.name("name")).sendKeys("Sriram");
	driver.findElement(By.name("contact")).sendKeys("9898989898");
	//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("dob")).sendKeys("14-05-1987");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Register")).click();

	//driver.findElement(By.linkText("Next")).click();
	
}
}
