package Week6;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass {
@Test
	public  void deleteLead() throws InterruptedException {
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
		
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("10088");		
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("682");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		   

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		Thread.sleep(5000);
		
		String firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/parent::div//input")).sendKeys(firstLead);
		                             
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String actMsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(actMsg);
		String expMsg = "No records to display";
		
		
	if(actMsg.equals(expMsg))	
		{
			
			System.out.println("Deletion of Records is succesfull");
		}
		else
			System.out.println("Record deletion Unsuccesfull"); 
		

	}

}
