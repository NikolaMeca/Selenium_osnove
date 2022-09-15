package p2022_09_13;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://s.bootsnipp.com/iframe/oV91g");
		
		List<WebElement> stranice = driver.findElements(By.id("myPager"));
		for(int i =0; i < stranice.size(); i++) {
			stranice.get(i).click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
