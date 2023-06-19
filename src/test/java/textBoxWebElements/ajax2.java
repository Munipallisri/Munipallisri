package textBoxWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajax2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Selenium");
	Thread.sleep(3000);
	List<WebElement>keywardslist=driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
	
	System.out.println(keywardslist.size());
	for(int i=0;i<keywardslist.size();i++)
	{
		String keyword=keywardslist.get(i).getText();
		if(keyword.toLowerCase().contains("download")) {
			keywardslist.get(i).click();
			
		}
		
	}
	}
}
