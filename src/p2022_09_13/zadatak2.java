package p2022_09_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/login");
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("itbootcamp");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("ITBootcamp2021!");
		
		driver.findElement(By.xpath("//form[@id='userForm']//button[@id='login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Log out']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
