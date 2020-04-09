package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		//Step1)Find the Table 
		WebElement table = driver.findElement(By.id("table_id"));
		
		//Step2)Find all the rows in the Table
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int countRows = allRows.size();
		System.out.println("Number of rows in the table = "+countRows);
		
		//To get the second rows
		WebElement secRow = allRows.get(2);
		
		//Step3)Find all the columns/table data in the rows
		List<WebElement> allColumns = secRow.findElements(By.tagName("td"));
		int countColumns = allColumns.size();
		System.out.println("Number of columns in the table = "+countColumns);
		
		//Step4)To find the progress value of 'Learn to Interact with the variable'
		//To find the second column value 
		String secVal = allColumns.get(1).getText();
		System.out.println(secVal);
		
		//or we can use direct method
		
		String secVal1 = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[3]/td[2]")).getText();
		System.out.println(secVal1);
	}

}