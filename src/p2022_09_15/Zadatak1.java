package p2022_09_15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cms.demo.katalon.com/my-account/");
		Thread.sleep(500);
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.id("rememberme")).isSelected());
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
