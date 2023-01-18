package week3.Day4Assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ServiceNowAssingment2 {

	public static void main(String[] args) throws InterruptedException {
		
//		https://dev110326.service-now.com/
//			Username: admin
//			Password: India@123
//
//			1. switchTo() frame using ID /Name
//			2. Enter username
//			3. Enter password
//			4. Click Login button
//			
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://dev110326.service-now.com/");
		
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame("gsft_main");
		 
		 driver.findElement(By.id("user_name")).sendKeys("admin");
		 
		 driver.findElement(By.id("user_password")).sendKeys("India@123");
		 
		 driver.findElement(By.id("sysverb_login")).click();
		 
		 String text = driver.getTitle();
		 
		 System.out.println(text);
		 
		 driver.switchTo().defaultContent();
		  
		if (text.contains("Unified Navigation App")) {
				
				System.out.println("Loggedin Sucecssfully");
			
			}
			else
				
				System.out.println("Failed login");
			
		}
		 
	}
	
