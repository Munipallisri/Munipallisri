package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexList {
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
		int itemcount=categorylist.size();
		System.out.println(itemcount);
		for(WebElement element:categorylist)
		{
			String catname=element.getText();
			System.out.println(catname);
		}
		
	}
}
