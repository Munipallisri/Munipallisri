package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataChq {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sriram");
		driver.findElement(By.name("lastName")).sendKeys("munipalli");

		String empno = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		//Thread.sleep(3000);
		
	//	driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empno);	
		driver.findElement(By.id("searchBtn")).click();

		WebElement emptable = driver.findElement(By.tagName("resultTable"));
		List<WebElement> rows, cols;
		rows = emptable.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			cols = rows.get(i).findElements(By.tagName("td"));
			if (cols.get(1).getText().equals(empno)) {
				System.out.println("New Emp Reg --Test Pass");
			}
			break;

		}

	}
}