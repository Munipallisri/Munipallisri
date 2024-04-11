package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1cl5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver,chrome,driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("img"));
		//List<WebElement> link=driver.findElements(By.tagName("img"));
		links.size();
		System.out.println(links.size());
		//links.get(12);
//		System.out.println(links.get(12));
//		String linkname=links.get(12).getText();
//		System.out.println(linkname);
//		for(int i=0;i<links.size();i++) {
//		System.out.println(links.get(i).getText());
		
	}
}
