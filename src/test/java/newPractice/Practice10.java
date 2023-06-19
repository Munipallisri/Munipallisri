package newPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM"));
		List<WebElement>links=driver.findElements(By.tagName("a"));
		//for(WebElement element:links)
		//{
			//String linkname=element.getText();
			//String linkurl=element.getAttribute("href");
			//System.out.println(linkname +"->"+linkurl);
		
		for(int i=0;i<links.size();i++)
		{
			
			System.out.println(links.get(i).getAttribute("href"));
	
	
	}
				
				
				
				
				
				
				
				
				
				
		
	}
}			
	


