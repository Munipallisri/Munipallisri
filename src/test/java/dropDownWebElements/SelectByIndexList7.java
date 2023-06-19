package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexList7 {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				WebElement Yelement=driver.findElement(By.id("searchDropdownBox"));
				Select category=new Select(Yelement);
				List<WebElement>categorylist=category.getOptions();
				String item_to_be_check="Yes";
				boolean isitempresent=false;
				
				for(int i=0;i<categorylist.size();i++)
				{
					if(categorylist.get(i).getText().equalsIgnoreCase(item_to_be_check))
					{
						isitempresent=true;
						break;
					}
				}
				if(isitempresent)
				{System.out.println(item_to_be_check  + "Test Pass");
					
				
				}
				else
				{
					System.out.println( item_to_be_check  + "Test fail");
				}
			}
}
	

	