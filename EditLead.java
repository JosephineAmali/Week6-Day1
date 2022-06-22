package Week6;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {
@Test
	public  void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.manage().window().maximize();
//		WebElement eleUserName = driver.findElement(By.id("username"));
//		eleUserName.sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);    	
    	driver.findElement(By.xpath("//label[text()='Lead ID:']//following::input[2]")).sendKeys("firstName");
    		 
    	
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
    	String title = driver.getTitle(); 		
		String expTitle = "View Lead | opentaps CRM";	
		if(title.equals(expTitle) )
		{
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.xpath("// tr//input[@name='companyName']")).clear();
			driver.findElement(By.xpath("// tr//input[@name='companyName']")).sendKeys("Modified");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String newCompany = "Modified";
			String chgCompany = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
			if(chgCompany.contains(newCompany)) {
				System.out.println("Edit Succesfull!");
				//driver.close();
			}
		}
	}
}


