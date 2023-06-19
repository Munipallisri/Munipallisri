package newPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		String expTitle,actTitle;
		expTitle="Google Images";
		actTitle=driver.getTitle();
		if(actTitle.equalsIgnoreCase(expTitle))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		

	}

}
