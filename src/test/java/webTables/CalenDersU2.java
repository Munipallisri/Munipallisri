package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenDersU2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.linkText("Register")).click();
		String dob = "18/Sep/2013";
		String[] temp = dob.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		driver.findElement(By.id("popupDatepicker")).click();
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist.selectByVisibleText(month);
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist.selectByVisibleText(year);

//		WebElement delement = driver.findElement(By.className("ui-datepicker-calendar"));
//		List<WebElement> rows, cols;
//		rows = delement.findElements(By.tagName("tr"));
//		for (int i = 1; i < rows.size(); i++) {
//			cols = rows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < cols.size(); j++) {
//				String caldt = cols.get(j).getText();
//				if (caldt.equals(date)) {
//					cols.get(j).click();
//					break;
					

				}
			
		

	}
