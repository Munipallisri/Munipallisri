package webTables;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TableDataForlo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.railyatri.in/time-table");
		WebElement tablelist=driver.findElement(By.xpath("//*[@id=\"train_number\"]"));
		List<WebElement>rows,cols;
		rows=driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			//System.out.println(cols.size());
		for(int j=0;j<cols.size();j++)
		{
			String data=cols.get(i).getText();
			System.out.print(data);
		}
		System.out.println();
		}
		
	}

}
