package p16_09_2022;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://crop-circle.imageonline.co/#circlecropresult");
		new Actions (driver).scrollToElement(driver.findElement(By.xpath("//div[contains(@class, 'image-upload text-center')]")));
		driver.findElement(By.id("inputImage"))
		.sendKeys(new File("img/slika za upload.jpg").getAbsolutePath());
		
		new Actions (driver).scrollToElement(driver.findElement(By.xpath("//p[text()='Check out the crop circle tool demo here']")));
		
		
		
		

		Thread.sleep(5000);
		driver.quit();
	}

}
