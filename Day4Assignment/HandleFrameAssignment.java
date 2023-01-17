package week3.Day4Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		1. Load https://buythevalue.in/
//			2. Click on first product (eg: Hamdard Hing - 50GM)
//			//Handle Frame
//			3. Close chat widget
//			4. Enter the pincode 
//			5. Click on Check
//			6. Click on ADD TO CART
//			7. Click on View
//			8. Click on CHECK OUT
//			//Handle alert
//			9. Accept the alert

		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions option =new ChromeOptions();
		option.addArguments("---disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
	
		driver.get("https://buythevalue.in/");
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
		
		//(//iframe)[3]
			
		Thread.sleep(2000);
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//div[@class='VizExIcon__IconWrapper-g7wiag-0 gCKEVu']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT')]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@class='wk_zipfinder_input']")).sendKeys("506101");
		driver.findElement(By.id("wk_zipcode")).sendKeys("506101");
		
		//driver.findElement(By.xpath("//input[@class='btn']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']//input")).click();
		
		WebElement checkbtn = driver.findElement(By.xpath("//input[@class='btn']"));
		driver.executeScript("arguments[0].click();", checkbtn);
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//span[text()='Add to Cart']/parent::button)")).click(); 
		
		driver.findElement(By.xpath("//span[text()='Add to Cart'][1]")).click();
		
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click(); 	
	
		driver.findElement(By.id("checkout")).click();	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
