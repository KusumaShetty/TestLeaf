package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment4 {

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
		
		//Click on Email		
		driver.findElementByLinkText("Email").click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		
		Thread.sleep(2000);
		String firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println(firstLead);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String duplicateLead =driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(duplicateLead);
		if(firstLead.equals(duplicateLead))
		{
			System.out.println("Name is Same");
		}
		else
		{
			System.out.println("Name is Different");
		}
		
		
		
		
		
		
		
	}

}