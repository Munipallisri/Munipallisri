package newPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoPWindw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[2]/button")).click();
		driver.findElement(By.linkText("Flight Bookings")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"contact-info\"]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[10]/a[3]")).click();
//		String alrtmsg = driver.switchTo().alert().getText();
//		if (alrtmsg.contains("Delete")) {
//			driver.switchTo().alert().accept();
//
//		} else {
//			driver.switchTo().alert().dismiss();
//		}
//
	}

}