package webTables;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TableRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://money.rediff.com/tools/forex");
		//List<WebElement>trr=driver.findElements(By.tagName("tr"));
		//System.out.println(trr.size());
		//List<WebElement>row=driver.findElement(By.className("dataTable")).findElements(By.tagName("tr"));
		//System.out.println(row.size());
		WebElement curtable=driver.findElement(By.className("dataTable"));
		List<WebElement>rows=curtable.findElements(By.tagName("tr"));
		//System.out.println(rows.size());
		List<WebElement>cols=rows.get(1).findElements(By.tagName("td"));
		System.out.println(cols.size());
		String curname=cols.get(0).getText();
		String currate=cols.get(1).getText();
		System.out.println(curname+ " ->" + currate); 
		
		
		
	}

}
