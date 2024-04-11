package PoPUpHanDle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsgTextDlt {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.linkText("Flight Bookings")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[10]/a[3]")).click();
		String alrtmes=driver.switchTo().alert().getText();
		if(alrtmes.contains("HI")) {
			driver.switchTo().alert().accept();
		}
		else {
			driver.switchTo().alert().dismiss();
		}
			}
}
