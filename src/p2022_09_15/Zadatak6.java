package p2022_09_15;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		driver.get("file:///C:/Users/Meca/Desktop/Zadatak6.html");
		
		for(int i =0; i < 5; i++) {
			driver.findElement(By.id("showInBtn")).click();
			WebElement novi = driver.findElement(By.id("id-"+i));
			if(novi.isDisplayed()) {
			}
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

