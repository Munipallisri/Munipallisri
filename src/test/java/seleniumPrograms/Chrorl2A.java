package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrorl2A{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().window().minimize();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("1234");
			driver.findElement(By.name("login")).click();
			String pgtitle=driver.getTitle();
			System.out.println(pgtitle);
			String exptitle="Log in";
			if(pgtitle.contains(exptitle)) {
				System.out.println("Test Case Pass");
			}
			else {
				System.out.println("Test case fail");
			}
		}
}	
			