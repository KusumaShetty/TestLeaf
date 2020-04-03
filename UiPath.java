package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UiPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.id("buttonLogin")).click();
		
		WebElement ele = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		builder.moveToElement(ele).click().perform();
		driver.findElement(By.linkText("Search for Vendor")).click();
		driver.findElement(By.id("vendorName")).sendKeys("Blue Lagoon");
		driver.findElement(By.id("buttonSearch")).click();
		String country = driver.findElement(By.xpath("/html/body/div/div[2]/div/table/tbody/tr[2]/td[5]")).getText();
		System.out.println(country);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
	}

}
