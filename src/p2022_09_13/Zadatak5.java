package p2022_09_13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://s.bootsnipp.com/iframe/z80en");
		List<WebElement> kolone = driver.findElements(By.xpath("//*[contains(@id, 'lorem')]//tr[1]"));
		for(int i =0; i < kolone.size(); i++) {
			kolone.get(i).getText();
		}
		Thread.sleep(1000);
		List<WebElement> redovi = driver.findElements(By.xpath("//tbody//tr"));
		for(int i =0; i < redovi.size(); i++) {
			for(int j = 0; i < redovi.size(); i++);
			
		}
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
