package newPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String expurl,acturl;
		expurl="gmail";
		acturl=driver.getCurrentUrl();
		driver.findElement(By.linkText("Gmail")).click();
		if(acturl.toLowerCase().contains(expurl))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test fail");
		}
	}

}
