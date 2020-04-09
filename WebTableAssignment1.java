package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://erail.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SBC",Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MAS",Keys.TAB);
		
		//To check the Sort on Date
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//To find first row, second column value	
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		//To get the Count
		int rowsCount = allRows.size();
		//To select first row
		WebElement firstRow = allRows.get(0);
		//To find the columns in the first row
		List<WebElement> allColumn = firstRow.findElements(By.tagName("td"));
		//To select the seond value
		String secValue = allColumn.get(1).getText();
		System.out.println(secValue);
/***************************************************************************************************************************/	
				
		//To get all columns in table
		List<WebElement> allTrains = table.findElements(By.tagName("td"));
		int colCount = allTrains.size();
		System.out.println(colCount);
		
		//To display all the trains
		for (int i=1;i<=rowsCount-1;i++)
		{
			WebElement firstRow1= allRows.get(i);
			WebElement allColumn1 = firstRow1.findElements(By.tagName("td")).get(1);
			System.out.println(allColumn1.getText());
			
		}
}
}