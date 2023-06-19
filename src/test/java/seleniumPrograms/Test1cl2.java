package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1cl2{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://orangehrm.qedgetech.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.name("Submit")).click();
			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Andrew");
			driver.findElement(By.className("ac_input")).sendKeys("abcd sgdsh");
			Thread.sleep(3000);
			driver.findElement(By.id("searchBtn")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//tbody//tr//td[2]"));
			String pgTitle=driver.getTitle();
			System.out.println(pgTitle);
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("arrow"));
			Thread.sleep(3000);
			driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
			driver.findElement(By.name("btnAdd")).click();
			driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("HR Department");
			driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("HR Works");
			driver.findElement(By.id("jobTitle[note]")).sendKeys("HR ");
			driver.findElement(By.id("btnSave")).click();
		//	String exptitle="Andrew";
		//	if(exptitle.contains(pgTitle)) {
				//System.out.println("Test pass");
			//}
			//else {
				//System.out.println("Test fail");
			//}
			driver.close();
			
			//driver.findElement(By.className("panelTrigger")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.linkText("Logout")).click();

	}
}