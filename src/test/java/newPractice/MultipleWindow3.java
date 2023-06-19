package newPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Object[] window=allwindows.toArray();
		String firwindow=window[0].toString();
		String secwindow=window[1].toString();
		driver.switchTo().window(secwindow);
		driver.findElement(By.linkText("Community")).click();
		
	}
	
}