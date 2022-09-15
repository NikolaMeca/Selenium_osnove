package d2022_09_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Scanner s= new Scanner(System.in);
		System.out.println("upisi operaciju");
		String operacija = s.next();
		Thread.sleep(500);
		driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");
		List<Character> chars = new ArrayList<>();
		for(char ch : operacija.toCharArray()) {
			chars.add(ch);
			Thread.sleep(500);
		}
		for(int i = 0; i < chars.size(); i++) {
			driver.findElement(By.name("display")).sendKeys(chars.get(i).toString());
			Thread.sleep(500);
			driver.findElement(By.id("calculatorWrap"));
			Thread.sleep(500);

		}
		driver.findElement(By.name("display")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
