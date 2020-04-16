package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.id("src")).sendKeys(Keys.TAB);
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElement(By.id("dest")).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[4]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//label[@title='After 6 pm']")).click();
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		driver.findElement(By.linkText("Seats Available")).click();
		driver.close();
		
	}

}
