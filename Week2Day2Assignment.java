package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day2Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kusuma Shetty\\Desktop\\Selenium\\MavenProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		//To Count how many images in the page
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		int imagecount = allImages.size();
		System.out.println(imagecount);
		
		//Click on Last Image
		allImages.get(imagecount-1).click();
		System.out.println(driver.getTitle());
		
		//Navigate back
		driver.navigate().to("http://www.leafground.com/home.html");
		
		//Radio Buttons
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title']/following::img)[6]")).click();
		
		//How many radio buttons:
		List<WebElement> radioCount = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radioCount.size());
		
		//Navigate back
		driver.navigate().to("http://www.leafground.com/home.html");
				
		//CheckBox
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title']/following::img)[7]")).click();
		
		//To uncheck the previously checked checkbox
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		
		Thread.sleep(1000);
		
		//check all the checkbox
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for (WebElement check : checkbox) {
			check.click();

		}	
		
		for (WebElement ischecked : checkbox) {
			
		boolean m = ischecked.isSelected();//boolean m variable is already declared
		
		if(ischecked.isSelected()) {
			
		}
		
		else
		{
			System.out.println("All checkbox are not checked");
			
			driver.close();
			break;
			
		}	
			
		}
		
		System.out.println("All checkbox are checked");
		driver.close();
		
		
	}
	

}