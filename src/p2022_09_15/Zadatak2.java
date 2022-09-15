package p2022_09_15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(500);
		
		Select lista = new Select(driver.findElement(By.id("gh-cat")));
		Thread.sleep(1000);
		lista.selectByVisibleText("Crafts");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
