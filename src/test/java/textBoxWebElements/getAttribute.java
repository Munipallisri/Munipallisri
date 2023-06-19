package textBoxWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.google.com/");
	WebElement sbutton=driver.findElement(By.name("btnK"));
	String x=sbutton.getAttribute("value");
	String y=sbutton.getAttribute("type");
			System.out.println(x);
			System.out.println(y);
			System.out.println(x +"love u"+  y);
}
}
