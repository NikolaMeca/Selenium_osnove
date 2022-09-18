package p2022_09_15;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
 stanja tog elementa
*/
	
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
