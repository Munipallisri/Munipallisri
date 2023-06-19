package newPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoPWindwdlelMl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/div[2]/button")).click();
		driver.findElement(By.linkText("Flight Bookings")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[2]/div/div[2]/div/div[2]/ul/li[2]/a")).click();
		WebElement order = driver.findElement(By.className("flights_table"));
		List<WebElement> rows, cols;
		String orderno = "6491";

		rows = order.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			cols = rows.get(i).findElements(By.tagName("td"));
			if (cols.get(0).getText().equals(orderno)) {
				cols.get(9).findElement(By.partialLinkText("Delete")).click();
				driver.switchTo().alert().accept();
				break;

			}

		}

	}

}