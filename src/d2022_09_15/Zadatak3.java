package d2022_09_15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zadatak3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://seeds.sproutsocial.com/components/loader-button/");
		 WebElement draggable = driver.findElement(By.xpath("//*[@opacity='1']"));
		 WebElement droppable = driver.findElement(By.xpath("//*[@opacity='1']"));
		
		new Actions (driver).dragAndDrop(draggable, droppable).perform();
		boolean ulogovan = true;
		try {
			driver.findElement(By.xpath("//*[@opacity='1']"));
		}catch(Exception e) {
			ulogovan = false;
			System.out.println("neje se ucitalo"); 
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
