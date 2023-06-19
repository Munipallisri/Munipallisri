package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexList4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement BBelement=driver.findElement(By.id("searchDropdownBox"));
		Select category=new Select(BBelement);
		List<WebElement>categorylist=category.getOptions();
		String item_to_be_check=("Baby");
		boolean isitempresent=false;
		for(int i=0;i<categorylist.size();i++)
		{
			System.out.println(categorylist);
			if(categorylist.get(i).getText().equalsIgnoreCase(item_to_be_check))
			isitempresent=true;
			break;
		}
		if(isitempresent)
		{
			System.out.println(item_to_be_check     + "TEST PASS");
		}
		else {
			System.out.println(item_to_be_check     + " TEST FAIL");
		}
	}
	}

	