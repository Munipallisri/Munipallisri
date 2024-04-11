package textBoxWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Add Employee")).click();
			WebElement butn=driver.findElement(By.name("employeeId"));
			String x=butn.getAttribute("value");
			System.out.println(x);
		}
	}
		