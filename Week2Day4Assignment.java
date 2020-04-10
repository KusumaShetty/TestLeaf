package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week2Day4Assignment {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//HomeWork-1
		/*driver.get("http://www.leafground.com/home.html");
		//To click on Droppable
		driver.findElement(By.xpath("//h5[text()='Droppable']")).click();
		//Find the Elements Reference
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions builder =new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();*/
		
		//HomeWork-2
		/*driver.get("https://www.flipkart.com/");
		
		//Handle the popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Find all the Element Reference
		WebElement tv = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions builder1 =new Actions(driver);
		builder1.moveToElement(tv).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
		String title = driver.findElement(By.xpath("//h1[@class='_2yAnYN']")).getText();
		if(title.contains("Mi Mobiles"))
		{
			System.out.println("The title contains Mi Mobiles");
		}*/
				
		//HomeWork-3
		driver.get("http://www.leafground.com/home.html");
		//To click on Sortable
		driver.findElement(By.xpath("//h5[text()='Sortable']")).click();
		//Find the Elements Reference
		WebElement item1 = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		WebElement item4 = driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
		
		int xcord = item1.getLocation().getX();
		int ycord = item1.getLocation().getY();
		int x1cord = item4.getLocation().getX();
		int y1cord = item4.getLocation().getY();
					
		Actions builder2 =new Actions(driver);
		builder2.dragAndDropBy(item1, xcord, y1cord).perform();
				
		}

}
