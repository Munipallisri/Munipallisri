package dropDownWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexTrycatch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		WebElement Belement=driver.findElement(By.id("searchDropdownBox"));
		try 
		{
			Select Catlist=new Select(Belement);
			Catlist.selectByVisibleText("babyh");
		}
		catch(Exception e)
		{
			System.out.println("Not found");
		}
}
}