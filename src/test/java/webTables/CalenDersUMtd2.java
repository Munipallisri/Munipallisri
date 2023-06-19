package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenDersUMtd2 {
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
		driver.findElement(By.id("search-date")).click();
		String flydate = "18-Sep-2033";
		String[] temp = flydate.split("-");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];

		String calyear = driver.findElement(By.className("ui-datepicker-calendar")).getText();
		while (!calyear.equals(year)) {						
			driver.findElement(By.linkText("Next")).click();
			calyear = driver.findElement(By.className("ui-datepicker-calendar")).getText();
		}
			String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			while (!calmonth.equals(month)) {
				driver.findElement(By.linkText("Next")).click();
				calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			}
			WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
			List<WebElement> rows, cols;
			rows = cal.findElements(By.tagName("tr"));
			for (int i = 1; i < rows.size(); i++) {
				cols = rows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < cols.size(); j++) {
					String coldata = cols.get(j).getText();
					// cols.get(j).getText();
					if (coldata.equals(date)) {
						cols.get(j).click();

					}
				}

			}

		}
	}
