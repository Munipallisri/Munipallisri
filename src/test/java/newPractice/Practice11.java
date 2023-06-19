package newPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map"));
		List<WebElement>list=driver.findElements(By.tagName("a"));
			
		
		for(int i=0;i<list.size();i++)
		{	String linkname=list.get(i).getText();
			
			System.out.println(linkname+ "--->" +list.get(i).getAttribute("href"));
		}
		
	
	}
}
