package week2.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("durga");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("durga");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Traning");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("learning java selenium");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("durgaabi73@gmail.com");
		
		System.out.println(driver.getTitle());
		
		
	}
		

		}
