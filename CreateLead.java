package Week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	@Test
	public  void createLead() throws InterruptedException {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("First Local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department Name");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleSource);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840528334");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("1");
		
		
		
		
		driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.linkText("Edit")).click();
		//driver.findElement(By.id("updateLeadForm_description")).clear();  
		//driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Notes");
		//driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		//WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Select  dd = new Select(ele);
		//dd.selectByIndex(2);
		//Thread.sleep(2000);
		//dd.selectByValue("LEAD_COLDCALL");
		//dd.selectByVisibleText("Conference");
		//driver.close();
		
	}

}
