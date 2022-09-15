package d2022_09_15;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		driver.get("https://s.bootsnipp.com/iframe/Dq2X");
		List<WebElement> iksevi = driver.findElements(By.xpath("//*[@class='close']"));
		
		boolean x = driver.findElement(By.className("close")).isDisplayed();
		for(int i = iksevi.size(); i > 0; i--) {
			driver.findElement(By.className("close")).click();
			if (x == true) {
				System.out.println("Prozor je uklonjen");
			}else {
				System.out.println("Prozor nije uklonjen");
			}
			
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

