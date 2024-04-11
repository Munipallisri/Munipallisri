package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexList5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement>category=driver.findElements(By.id("searchDropdownBox"));
		for(int i=0;i<category.size();i++)
		{
			System.out.println(category.get(i).getText());
		}
		//for(WebElement element:category)
		//{
			//if(!element.getTagName().isEmpty())
			//{
				//System.out.println(element.getText());
			//}
		}
	}

		
	

	