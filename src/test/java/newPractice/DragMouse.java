package newPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		Actions act=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement srrcelement,trgtelement;
		srrcelement=driver.findElement(By.id("draggable"));
		trgtelement=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(srrcelement,trgtelement);
		act.build().perform();
		
		
		

	}

}
