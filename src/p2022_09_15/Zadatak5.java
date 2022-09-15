package p2022_09_15;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("itbootcamp");
		driver.findElement(By.id("password")).sendKeys("ITBootcamp2021!");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		boolean ulogovan = true;
		
		try {
			driver.findElement(By.xpath("//*[@id='books-wrapper']//*[@id='submit']"));
		}catch(Exception e) {
			ulogovan = false;
			System.out.println("neje se ulogovao");
		}
		System.out.println("Ulogovao se");
		driver.findElement(By.xpath("//*[@id='books-wrapper']//*[@id='submit']")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

