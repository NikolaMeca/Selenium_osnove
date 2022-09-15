package p2022_09_15;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Random r = new Random();
		driver.get("https://www.ebay.com/");
		Thread.sleep(500);
		
		Select s = new Select(driver.findElement(By.id("gh-cat")));
		Thread.sleep(1000);
		List <WebElement> lista = s.getOptions();
		Thread.sleep(1000);
		
	
		Thread.sleep(1000);
		for(int i =0; i < lista.size(); i++){
	         String options = lista.get(i).getText();
	         System.out.println(options);
	      }
		Thread.sleep(1000);
		int broj = r.nextInt(lista.size());
		
		s.selectByVisibleText(lista.get(broj).getText());
		
		Thread.sleep(5000);
		driver.quit();
	}

}
