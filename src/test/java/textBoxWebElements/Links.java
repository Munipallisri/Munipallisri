package textBoxWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.amazon.in/");
	List<WebElement>amazonLinks=driver.findElements(By.tagName("a"));
	System.out.println(amazonLinks.size());
	for(WebElement element:amazonLinks)
	{
		if(!element.getText().isEmpty())
{
		System.out.println(element.getText());
	}
}
}
}