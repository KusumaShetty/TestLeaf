package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		//URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enter Email/Phone & Password
		driver.findElementById("email").sendKeys("Email ID");
		driver.findElementById("pass").sendKeys("Pasword");
		Thread.sleep(4000);
		//Login 
		driver.findElementById("loginbutton").click();
		Thread.sleep(10000);
		//driver.switchTo().alert().dismiss();//
		//Logout
		driver.findElementById("userNavigationLabel").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@data-gt='{\"ref\":\"async_menu\",\"logout_menu_click\":\"menu_logout\"}']").click();
						
	}
}
