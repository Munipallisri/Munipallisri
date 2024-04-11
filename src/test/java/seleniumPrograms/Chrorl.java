package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrorl{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().window().minimize();
			driver.manage().window().maximize();
			driver.get("https://web.whatsapp.com/");
			Thread.sleep(5000);
			driver.navigate().to("https://www.instagram.com/");
			Thread.sleep(5000);
			driver.navigate().to("https://www.flipkart.com/");
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			driver.navigate().forward();
			Thread.sleep(5000);
			driver.navigate().to("https://www.youtube.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-mini-guide-renderer[1]/div[1]/ytd-mini-guide-entry-renderer[2]/a[1]"));
			
			String expurl,acturl;
			
			expurl="youtube";
			acturl=driver.getCurrentUrl();
			System.out.println(acturl);
			if(expurl.contains(acturl)) {
				System.out.println("Test Pass");
				}
			else {
				System.out.println("Test fail");
			}
			driver.navigate().to("https://www.google.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=GAZAmgQ']//span"));
				
		//	driver.close();
			
			
		}
		
		
	}