package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenDersNxt {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"search-date\"]")).click();

		String flydate = ("20-August-2024");
		String[] temp = flydate.split("-");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];	

		String calyear = driver.findElement(By.className("ui-datepicker-calendar")).getText();
		while (!calyear.equals(year)) {
			driver.findElement(By.linkText("Next")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month)) {
			driver.findElement(By.linkText("Next")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}	
		WebElement cal=driver.findElement(By.id("ui-datepicker-calendar"));
		List<WebElement>row,col;
		row=cal.findElements(By.tagName("tr"));
		for(int i=1;i<row.size();i++)
		{
			col=row.get(i).findElements(By.tagName("td"));
		for(int j=0;j<col.size();j++)
		{
			String coldata=col.get(j).getText();
			if(coldata.equals(date))
			{
				col.get(j).click();
			}
		}
		}
		
			

	}
}
