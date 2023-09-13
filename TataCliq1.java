package selenium.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TataCliq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ChromeDriver driver = new ChromeDriver();
			// load the url
			driver.get("https://www.tatacliq.com/");
			//maximize the browser
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
			
			driver.findElement(By.xpath("//div[text()='Brands']")).click();
			
			driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
			
			driver.findElement(By.xpath("//div[text()='Casio']")).click();
			
			WebElement sortby = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
			
			Select Dropdowm=new Select(sortby);
			
			Dropdowm.selectByVisibleText("New Arrivals");
			
			driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
			}
		

	}

