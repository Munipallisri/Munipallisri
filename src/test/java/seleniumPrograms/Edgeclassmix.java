package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edgeclassmix{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.Edge.driver","edgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.quit();
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			
			driver1.navigate().to("https://www.amazon.in/");
			driver1.manage().window().maximize();
			Thread.sleep(5000);
			driver1.quit();
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriver driver2 = new FirefoxDriver();

			driver2.navigate().to("https://www.myntra.com/");
			driver2.navigate().back();
			driver2.navigate().forward();
			driver2.navigate().to("https://codehuman.in/");
			driver2.findElement(By.xpath("//body//div//header//div//div//div//nav//div[@id='navbarSupportedContent']//ul//li//a[@href='contact.html']"));
			String expurl,acturl;
			expurl="code";
			acturl=driver2.getCurrentUrl();
			if(acturl.contains(expurl)) {
				System.out.println("Test pass");
			}
			else {System.out.println("Test Fail");
				}
			System.out.println(acturl);
			}
	}