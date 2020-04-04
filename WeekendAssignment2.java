package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class WeekendAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		//implicit wait		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		//get url		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Login
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Lead Link		
		driver.findElement(By.linkText("Leads")).click();
		
		//find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);		
		//driver.findElement(By.xpath("//input[@class='firstName'])[3]")).sendKeys("Babu");
		
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[25]")).sendKeys("Babu");
		
		//Click on Find Leads Button
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(2000);
		String firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println(firstLead);
		driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		//Edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("MickeyMouse");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Confirm the update Lead Name
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		driver.close();
		
	}
}
		
		
		
		
		
		
		
		
		
		