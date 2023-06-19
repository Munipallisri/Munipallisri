package seleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multy2{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
//			driver.manage().window().minimize();
	//		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.name("Submit")).click();
	//		driver.findElement(By.name("Submit")).click();
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Employee List"));
			List<WebElement>chklist=driver.findElements(By.xpath("//*[starts-with(@id,'ohrmList_chkSelectRecord')]"));
				for (int i=0;i<chklist.size();i++)
				{
					chklist.get(i).click();
				}
			
			
			
		}
	}
		