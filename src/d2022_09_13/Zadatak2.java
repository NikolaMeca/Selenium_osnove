package d2022_09_13;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("https://s.bootsnipp.com/iframe/WaXlr");
		Thread.sleep(1000);
			
		
		List<WebElement> zvezdice = driver.findElements(By.xpath("//*[contains(@id, 'rating-ability-wrapper')]/button"));
		Scanner s = new Scanner(System.in);
		System.out.println("Unesi broj");
		int indeks = s.nextInt();
		zvezdice.get(indeks).click();
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
