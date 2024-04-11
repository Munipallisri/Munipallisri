package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
		
		String expurl,acturl;
		
		expurl="https://www.Google.com/";
		acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		if(expurl.equals(acturl)){
			System.out.println("test pass");
		}
		else {
			System.out.println("fail");
		}
	}
}
