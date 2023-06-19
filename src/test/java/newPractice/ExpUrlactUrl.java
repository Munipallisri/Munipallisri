package newPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpUrlactUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail"));
		String expurl,acturl;
		expurl="google";
		acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		if(acturl.toLowerCase().contains(expurl))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}