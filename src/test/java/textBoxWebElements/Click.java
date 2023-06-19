package textBoxWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.google.com/");
	driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.name("identifier")).sendKeys("sms@gmail.com");
	driver.findElement(By.linkText("Next")).click();
	
}
}
