package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kusuma");
		driver.findElementById("createLeadForm_lastName").sendKeys("Shetty");
		
		//To Select Source Dropdown
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropdown1);
		dd.selectByVisibleText("Existing Customer");
		
		//To Select Industry
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1 = new Select(dropdown2);
		
		//To get the Count
		List<WebElement> options = dd1.getOptions();
		int count = options.size();
		dd1.selectByIndex(count-1);
				
		/*driver.findElementByName("submitButton").click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.close();	*/	
			
	}

}