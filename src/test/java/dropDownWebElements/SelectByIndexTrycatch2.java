package dropDownWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexTrycatch2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		//Thread.sleep(3000);
		WebElement yelemenet=driver.findElement(By.id("searchDropdownBox"));
		//Select category=new Select(yelemenet);
		//category.selectByIndex(3);
		//category.selectByVisibleText("Baby");
		try 
		{
			Select category=new Select(yelemenet);
			category.selectByVisibleText("Books");
				System.out.println("category ?'Books' selected.");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Not found");
		}
	}
}
