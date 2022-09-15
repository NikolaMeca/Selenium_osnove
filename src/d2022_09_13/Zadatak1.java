package d2022_09_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);

		driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.xpath("//*[@name='password']"));
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("Me");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']//span")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
