package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class WeekendAssignment1 {

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
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(2000);
		
		String leadId= driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(leadId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']/div/a)[1]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		//Verification for Deletion
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(leadId);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String verify = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (verify.equals("No records to display"))
		{
			System.out.println("Verification Successfull , Record deleted . Displayed title =  "+verify);
		}
		else
		{
			System.out.println("Verification Failure,Displayes title is "+verify);
		}
			
			
		
		driver.close();
		
	}
}
		
		
		
		
		
		
		
		
		
		