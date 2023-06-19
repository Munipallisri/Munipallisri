package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgeclass1a{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.Edge.driver","edgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.navigate().to("https://www.amazon.in/");
			Thread.sleep(5000);
			driver.navigate().to("https://www.myntra.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().to("https://codehuman.in/");
			driver.findElement(By.xpath("//body//div//header//div//div//div//nav//div[@id='navbarSupportedContent']//ul//li//a[@href='contact.html']"));
			String expurl,acturl;
			expurl="code";
			acturl=driver.getCurrentUrl();
			if(expurl.contains(acturl)) {
				System.out.println("Test pass");
			}
			else {System.out.println("Test Fail");
				}
			System.out.println(acturl);
			
			
			
			
			
		}
	}