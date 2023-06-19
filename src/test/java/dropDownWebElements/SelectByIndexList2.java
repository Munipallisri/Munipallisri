package dropDownWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexList2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		WebElement Belement=driver.findElement(By.id("searchDropdownBox"));
		Select category=new Select(Belement);
		List<WebElement>catlist=category.getOptions();
		int item=catlist.size();
		System.out.println(item);
		for(WebElement element:catlist)
		{
			String Category=element.getText();
			System.out.println(Category);
		}
}		
	}

