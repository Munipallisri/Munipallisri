package textBoxWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trycatch{
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
			driver.findElement(By.id("btnLogin")).click();

			try 
			{
				if(driver.findElement(By.linkText("Dhoni")).isDisplayed())
				{ 
					System.out.println("Admin test will pass for valid data");
				}
				
			}
			catch (Exception e) {
				
				System.out.println("Admin login test fail for invalid data");
			}
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			
		}
	}
		