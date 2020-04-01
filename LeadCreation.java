package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeadCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kusuma");
		driver.findElementById("createLeadForm_lastName").sendKeys("Shetty");
		driver.findElementByName("submitButton").click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.close();		
			
	}

}
