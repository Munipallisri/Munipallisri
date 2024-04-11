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
		WebElement DropList=driver.findElement(By.id("searchDropdownBox"));
		Select category=new Select(DropList);
		List<WebElement> categorylist=category.getOptions();
		int catecount=categorylist.size();
		System.out.println(catecount);
		for(WebElement list:categorylist) {
			String catnames=list.getText();
			System.out.println(catnames);
		}
	}
}
