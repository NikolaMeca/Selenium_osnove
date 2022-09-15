package p2022_09_15;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cms.demo.katalon.com/");
		Thread.sleep(500);
		
		WebElement dugmad = driver.findElement(By.xpath("//*[@class='menu-toggle']"));
		Thread.sleep(500);
		System.out.println(dugmad.isDisplayed());
		Thread.sleep(500);
		driver.manage().window().setSize(new Dimension(700, 700));
		Thread.sleep(500);
		WebElement dugmence = driver.findElement(By.xpath("//*[@class='menu-toggle']"));
		System.out.println(dugmence.isDisplayed());
		
		Thread.sleep(5000);
		driver.quit();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

}

