package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexListAssending3 {
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
		boolean Ordered=true;
		for(int i=2;i<categorylist.size();i++)
		{
			cat1=categorylist.get(i-1).getText();
			cat2=categorylist.get(i).getText();
			System.out.println(cat1+"  "+cat2);
		if(cat2.compareToIgnoreCase(cat1)<0)
		{
			Ordered=false;
					break;
		}
		}	
		
		if(Ordered)
			{
				System.out.println("in Assending order");
			}
			else 
			{
				System.out.println("Not In Assinding order");
			}
		
		}
	}

	

