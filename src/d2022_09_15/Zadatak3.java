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
	/*3.Zadatak (Za vezbanje)
Napisati program koji 
Ucitava https://seeds.sproutsocial.com/components/loader-button/
Odskrola do Loader buttons are used to display a loading indicator inside of a button.
 paragrafa. Koristan link
Klikce ne dugme 
Ceka da dugme zavrsi sa loadingom 
Ispisati poruku na ekranu
Zatvoriti pretrazivac
HINT: Koristite data-qa-button-isloading  atribut elementa za cekanje odredjenog 
stanja tog elementa*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://seeds.sproutsocial.com/components/loader-button/");
		String klik = driver.findElement(By.xpath
				("//div[contains(@class, 'CodeSandbox__Container-sc-9lhwa5-0')]/div[2]//div"))
				.getAttribute("data-qa-button-isloading");
		
		System.out.println(klik);
		
		new Actions (driver)
		.moveToElement(driver.findElement(By.xpath
				("//div[contains(@class, 'CodeSandbox__Container-sc-9lhwa5-0')]/div[2]//div")))
		.click().perform();
		
		System.out.println(klik);
		Thread.sleep(5000);
		driver.quit();

	}

}
