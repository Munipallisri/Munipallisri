package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chrome,driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driver.findElement(By.xpath("//*[contains(@placeholder,'phone ')]")).sendKeys("ORA");
		driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("Hi");
}

}
