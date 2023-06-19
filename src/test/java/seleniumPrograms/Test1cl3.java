package seleniumPrograms;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1cl3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver,chrome,driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[href='Corporate Banking.html']")).click();
	//	Thread.sleep(3000);
	//	List<WebElement>links=driver.findElements(By.linkText("Home"));
		//System.out.println(links.size());
//		driver.findElement(By.linkText("Home")).click();
//		Thread.sleep(3000); 
//		driver.findElement(By.id("personal")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Demo")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Personal Banking")).click();
	//	List<WebElement>linElements=driver.findElements(By.linkText("Personal Banking"));
	//	System.out.println(links.size());
	//	Thread.sleep(3000);
		//links.get(1).click();
		}
}
