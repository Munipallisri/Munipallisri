package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Live Scores']")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.contains("Update")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.close();
	}

}
