package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexListCompare {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		//Thread.sleep(3000);
		WebElement yelemenet=driver.findElement(By.id("searchDropdownBox"));
		Select category=new Select(yelemenet);
		List<WebElement>categorylist=category.getOptions();
		
		
		String cat1,cat2;
		for(int i=0;i<categorylist.size();i++)
		{
			cat1=categorylist.get(i).getText();
			cat2=categorylist.get(i+1).getText();
			System.out.println(cat1+"    "+cat2);
		}
				}
}
	
