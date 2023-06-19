package newPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackWindow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// driver.get("https://jqueryui.com/");
//		String mainwindow=driver.getWindowHandle();
		// driver.findElement(By.linkText("Droppable")).click();
//		driver.getWindowHandle();
//		driver.findElement(By.linkText("Demos")).click();

//		driver.get("https://jqueryui.com/");
//		driver.findElement(By.linkText("Droppable")).click();
//		Actions act=new Actions(driver);
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//		
//		WebElement srcelement,trgtelement;
//		
//		srcelement=driver.findElement(By.id("draggable"));
//		trgtelement=driver.findElement(By.id("droppable"));
//		
//		act.dragAndDrop(srcelement, trgtelement);
//		act.build().perform();

//		driver.get("https://www.gmail.com/");
//		//driver.findElement(By.linkText("Gmail")).click();
//		String mainwindow=driver.getWindowHandle();
//		driver.findElement(By.linkText("Help")).click();
//		driver.findElement(By.linkText("Privacy")).click();

//		driver.get("https://www.gmail.com/");	
//		driver.findElement(By.linkText("Help")).click();
//		Set<String>allwindows=driver.getWindowHandles();
//		System.out.println(allwindows);
//		Object[]window=allwindows.toArray();
//		
//		String frswindow=window[0].toString();
//		String secwindow=window[1].toString();
//		
//		driver.switchTo().window(secwindow);
//		driver.findElement(By.linkText("Community")).click();

		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.linkText("Flight Bookings")).click();
		driver.findElement(By.xpath("//tbody//tr//a[3]")).click();
		String alrtmsg = driver.switchTo().alert().getText();
		if (alrtmsg.contains("Delete")) {
			driver.switchTo().alert().accept();

		} else {
			driver.switchTo().alert().dismiss();
		}
	}
}