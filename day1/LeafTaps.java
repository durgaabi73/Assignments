package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
	
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 System.out.println(driver.getTitle());
		 //driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.partialLinkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drop1= new Select(source);
		// drop1.selectByIndex(3);
		 drop1.selectByValue("LEAD_DIRECTMAIL");
		 driver.findElement(By.name("submitButton")).click();
		 //driver.close();
		 
		 
		 
		 
	
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
		 

}
