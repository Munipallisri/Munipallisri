package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.espncricinfo.com/");

		driver.findElement(By.xpath("//a[@title='Cricket Series']")).click();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		if (pagetitle.equalsIgnoreCase("cricket Schedule - current, Upcoming ODI, Test & T20 Cricket Series | ESPNcricinfo.com")){
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
	}

}
