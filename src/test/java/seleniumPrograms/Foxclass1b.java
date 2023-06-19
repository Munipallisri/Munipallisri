package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Foxclass1b{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.tagName("a"));

		String expurl, acturl;
		expurl = "google";
		acturl = driver.getCurrentUrl();
		if (acturl.contains(expurl)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
		driver.close();
	}
}
