package week3.day2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class List {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
		
		//Click on Sort on Date
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	
		//Get all the Train Names- Xpath: //div[@id='divTrainsList']//td[@class=''][2] 
		java.util.List<WebElement> allTrains = driver.findElements(By.xpath("//div[@id='divTrainsList']//td[@class=''][2]"));
		
		
		//Create another List using ArrayList (trainNames)
		ArrayList<String> allTrains1 = new ArrayList<String>();
		
		System.out.println("All Train Names before sorting:");
		
		//for each loop : List<WebElement> //You will get each WebElement : get its text 
		for (WebElement trainNames : allTrains) {
			
			String train = trainNames.getText();
			System.out.println(train);
			
			//add all the train names to the new Array list
				allTrains1.add(train);
			
					}
			System.out.println("******************************");
			System.out.println("All Train Names after sorting:");
			
			Collections.sort(allTrains1);
			for (int i = 0; i < allTrains1.size(); i++) 
			{
			System.out.println(allTrains1.get(i));

			}
		
	}
}


