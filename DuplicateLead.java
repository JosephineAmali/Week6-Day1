package Week6;

import java.sql.DriverManager;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseClass {
	@Test

	public  void duplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();
//		WebElement eleUserName = driver.findElement(By.id("username"));
//		eleUserName.sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("yuvarani562@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);

		String firstLeadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		//first link  click
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
		//duplicate lead link click
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();		
		String title = driver.getTitle(); 		
		String expTitle = "Duplicate Lead | opentaps CRM";				
		if(title.equals(expTitle) )
		{
			
			String capturedName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getAttribute("value");
			
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			
			if(capturedName.equals(firstLeadName))
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();		
				System.out.println("Success!");
			}
		}
		else
			System.out.println("Error in Navigation");
	}
}
