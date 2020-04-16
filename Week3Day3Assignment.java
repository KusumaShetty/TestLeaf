package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Week3Day3Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		//implicit wait		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		//get url		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Lead Link		
		driver.findElement(By.linkText("Leads")).click();
		
		//find leads
		driver.findElement(By.linkText("Merge Leads")).click();
		Thread.sleep(2000);		
		
		//From Lead
		driver.findElement(By.xpath("(//a)[37]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List <String> lst = new ArrayList <String>(windowHandles);
		System.out.println(lst.size());
		
		//Switch to Find Lead Window	
		driver.switchTo().window(lst.get(1));
	
		//find the lead and click on the first result
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Babu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
						
		//Switch back to Merge window
		driver.switchTo().window(lst.get(0));
		
		//From Lead
		driver.findElement(By.xpath("(//a)[38]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1.size());
		List <String> lst1 = new ArrayList <String>(windowHandles1);
		System.out.println(lst1.size());
		
		//Switch to Find Lead Window	
		driver.switchTo().window(lst1.get(1));
		
		//find the lead and click on the first result
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kunfu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		//Switch back to Merge window
		driver.switchTo().window(lst1.get(0));
		
		//Click on Merge Button
		driver.findElement(By.linkText("Merge")).click();
		
		//Switch to Alert window
		Alert alert = driver.switchTo().alert();
		
		//Click on OK
		alert.accept();
			
		//Inorder to confirm the merge compelete seach the From lead ID
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10150");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();	
		System.out.println("From is successfully merged with To Lead so: "+text);
		
	}
}
		
		
		
		
		
		
		
		
		
		