package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("durga");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("durga");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("durga");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Training");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning java selenium");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("durgaabi73@gmail.com");
				
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate button")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("durga");
		
		driver.findElement(By.name("create lead button")).click();
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		}
}
	
	
	
	
	

