package p2022_09_13;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prviZadatak {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cms.demo.katalon.com/");
		WebElement searchInput = 
				driver.findElement(By.xpath("//input[@name='s']"));
		searchInput.sendKeys("Flying ninja");
		driver.findElement(By.xpath("//*[contains(@class, 'search-submit')]")).click();
		Thread.sleep(5000);
		driver.quit();


		
		
		
	}

}
