package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TableDataFrLop {
	public static void main(String[] args) {
		System.setProperty(("webdriver.chrome.driver"), ("chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.railyatri.in/time-table");
		WebElement table=driver.findElement(By.xpath("//*[@id=\"train_number\"]"));
		List<WebElement> rows,cols;
		rows=driver.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			String data=cols.get(i).getText();
			System.out.println(data);
		}
		System.out.println();
			}
}
