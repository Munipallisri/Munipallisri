package newPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleIgnoranceCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("personal"));
		String exptitle,acttitle;
		exptitle="tech";
		acttitle=driver.getCurrentUrl();
		System.out.println(acttitle);
		if(exptitle.equalsIgnoreCase(acttitle))
		{System.out.println("test pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
