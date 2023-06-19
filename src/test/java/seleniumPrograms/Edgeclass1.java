package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgeclass1{

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver", "edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.tagName("span"));

		String expurl, acturl;
		expurl = "cricket";
		acturl = driver.getCurrentUrl();
		if (acturl.contains(expurl)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
		driver.close();
	}
}
