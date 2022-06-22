package Week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseClass {
	@Test

	public void createContact() {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver  = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		driver.manage().window().maximize();
//		WebElement eleUserName = driver.findElement(By.id("username"));
//		eleUserName.sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("First");
		driver.findElement(By.id("lastNameField")).sendKeys("Last");
		driver.findElement(By.name("departmentName")).sendKeys("Department Name");
		driver.findElement(By.name("description")).sendKeys("Description");
		driver.findElement(By.name("primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement elestate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ddstate = new Select(elestate);
		ddstate.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Important_Note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);


	}

}
