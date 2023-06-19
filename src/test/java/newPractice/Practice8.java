package newPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement element:links)
		{
			String linkname=element.getText();
			element.click();
			String linkurl=driver.getCurrentUrl();
			System.out.println(linkname+"   -> "+linkurl);
			driver.navigate().back();
		}
				

	}

}
