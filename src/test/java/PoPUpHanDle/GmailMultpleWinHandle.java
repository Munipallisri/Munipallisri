package PoPUpHanDle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailMultpleWinHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.gmail.com/");
		String curwindow=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Help")).click();
	//	String helwindow=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Privacy")).click();
		
	}

}
