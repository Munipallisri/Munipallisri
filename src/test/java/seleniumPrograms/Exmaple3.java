package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exmaple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		
		String expurl,acturl;
		expurl="about";
		acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		if(acturl.contains(expurl))
				{
			System.out.println("Test Pass");	
		}
		else {
			System.out.println("Test Fail");
		}
		//String currentUrl=driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		driver.close();
	}
		

}
