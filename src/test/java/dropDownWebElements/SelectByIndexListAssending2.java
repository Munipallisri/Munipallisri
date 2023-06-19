package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexListAssending2 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Pelement=driver.findElement(By.id("searchDropdownBox"));
		Select category=new Select(Pelement);
		List<WebElement>categorylist=category.getOptions();
		String cat1,cat2;
		boolean ordered=true;
		for(int i=1;i<categorylist.size();i++)
		{
			cat1=categorylist.get(i-1).getText();
			cat2=categorylist.get(i).getText();
			
			if(cat2.compareToIgnoreCase(cat1)<0)
			{
				ordered=false;
				break;
			}
		}
		if(ordered)
		{
			System.out.println("IN");
		}
		else
		{
			System.out.println("OUt");
		}
	}	
}
