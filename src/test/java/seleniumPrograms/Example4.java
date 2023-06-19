package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		
		String expurl,acturl;
		expurl="google";
		acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		if (acturl.contains(expurl))
			{		System.out.println("Test Pass");
	}
		else
		{System.out.println("Test fail");
		}
			
		driver.close();
	}

}
