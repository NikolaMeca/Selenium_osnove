package d2022_09_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		Thread.sleep(2000);
		
		for(int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//*[@type='button']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("name")).sendKeys("Nikola");
			Thread.sleep(1000);
			driver.findElement(By.id("department")).sendKeys("Human Resources");
			Thread.sleep(1000);
			driver.findElement(By.id("phone")).sendKeys("063548551");
			driver.findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr[last()]/td[last()]/a[1]"))
					.click();
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
