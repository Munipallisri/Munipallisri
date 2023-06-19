package textBoxWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2{
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
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Add Employee")).click();
			WebElement gbutton=driver.findElement(By.id("employeeId"));
			String x=gbutton.getAttribute("value");
			System.out.println(x);

			
			
			
			

			//driver.close();
			
		}
	}
		