package newPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://gmail.com");
		String curwindow = driver.getWindowHandle();	
		System.out.println(curwindow);
		driver.findElement(By.linkText("Help")).click();
		String win=driver.getWindowHandle();
		System.out.println(win);
		driver.findElement(By.linkText("Privacy")).click();
		
		
	}
	
}