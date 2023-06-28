package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get( "https://dev31913.service-now.com/navpage.do");
		
		        //maximize the browser
		        driver.manage().window().maximize();
		       //find the element enter the username
		        driver.findElement(By.id("user_name")).sendKeys("admin") ;
		        //find the element of password
		        driver.findElement(By.id("password")).sendKeys("q+NozS5Qe8!E");
		        //Click the  login button
		        driver.findElement(By.className("sysverb_login")).click();
		        //get the title of current open page
		        System.out.println(driver.getTitle());
		        driver.findElement(By.partialLinkText("CRM/SFA")).click();
		        
		        
		         
		        
		        
		        

		        
		        		        
		        
		        
		        
		        
		        
		         
		        
		       
	}

}
