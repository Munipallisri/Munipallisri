package dropDownWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(19);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Feb");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1987");
		driver.close();
			}
}
