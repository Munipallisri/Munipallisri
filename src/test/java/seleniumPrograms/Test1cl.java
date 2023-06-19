package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1cl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver,chrome,driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Site Map")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("personal")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Demo")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Personal Banking")).click();


		
		
	}

}
