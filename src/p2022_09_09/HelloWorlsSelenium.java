package p2022_09_09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorlsSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().window().minimize();
		driver.findElement(By.xpath("//*[@name='q']"));
//		WebElement searchInput = driver.findElement(By.xpath("//*[@name='q']"));
//		searchInput.sendKeys("IT Bootcamp");
//		this.getKorisnik().stampaj
		
		driver.findElement(By.xpath("//*[@name='q']"))
		.sendKeys("IT Botcamp");
		driver.findElement(By.xpath("//*[@name='q']"))
		.sendKeys(Keys.ENTER);
		
		
//		searchInput.sendKeys(Keys.ENTER);
		//searchInput.clear();
		//searchInput.sendKeys("1000");
//		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
