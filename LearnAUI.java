package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Class Assignment-1 Leafground-Selectable
		//URL
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//Find all the Element Reference
		WebElement item7 = driver.findElement(By.xpath("//ol[@id='selectable']/li[7]"));
		WebElement item6 = driver.findElement(By.xpath("//ol[@id='selectable']/li[6]"));
		WebElement item5 = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
		WebElement item4 = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
		
		Actions builder =new Actions(driver);
		builder.clickAndHold(item7).release(item4).perform();
		
		//Class Assignment-2 Flipkart(Selectable-2)
		//URL
		driver.get("https://www.flipkart.com/");
		
		//Handle the popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Find all the Element Reference
		WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		
		Actions builder1 =new Actions(driver);
		builder1.moveToElement(tv).perform();
		
		driver.findElement(By.xpath("//a[text()='LG']")).click();
		String text = driver.findElement(By.xpath("//div[@class='_3wU53n']")).getText();
		System.out.println(text);
		
		//1)Class Room-Drag & Drop
		driver.get("http://www.leafground.com/pages/drop.html");
		//Find the Elements Reference
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions builder2 =new Actions(driver);
		builder2.dragAndDrop(drag, drop).perform();
		
		//2)Class Assignment-2 leaf grounds(Selectable-1)
		
		//URL
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//Find the Elements Reference
		WebElement item1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		WebElement item3 = driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
		WebElement item05 = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
		WebElement item07 = driver.findElement(By.xpath("//ol[@id='selectable']/li[7]"));
		
		Actions builder3 =new Actions(driver);
		builder3.keyDown(Keys.CONTROL).click(item1).click(item3).click(item05).click(item07).perform();
		
	}

}
