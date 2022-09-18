package p16_09_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zadatak1 {
/*1.Zad
Napisati program koji:
Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
Implicitno cekanje za trazenje elemenata je maksimalno 10s
Implicitno cekanje za ucitavanje stranice je 5s
Ucitava stranicu https://docs.katalon.com/
Maksimizuje prozor
Od html elementa cita data-theme atribut. 
Korisni linkovi za citanje vrednosti atributa link1 i link2
Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
Klikce na dugme za zamenu tema
Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
Izvrsava kombinaciju tastera CTRL + K. Koristan link  za keyboard actions…kako izvrsavati 
precice preko Actions objekta
Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
Zatvara pretrazivac
*/
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://docs.katalon.com/");
		driver.manage().window().maximize();
		WebElement tema = driver.findElement(By.xpath("//html"));
		System.out.println(tema.getAttribute("data-theme"));
		boolean svetlo = true;
		String vrednost = tema.getAttribute("data-theme");
		
		if(tema.getAttribute("data-theme").equals("light")) {
			 svetlo = true;
			 System.out.println("Tema je svetla");
		}else {
			svetlo = false;
			System.out.println("Tema je mracna");
		}
		System.out.println("Vrednost atribuda je " + vrednost);
		driver.findElement(By.xpath("//div[contains(@class, 'toggle_S7eR')]/button")).click();
		vrednost = tema.getAttribute("data-theme");
		
		if(tema.getAttribute("data-theme").equals("dark")) {
			 svetlo = true;
			 System.out.println("Tema je tamna");
		}else {
			svetlo = false;
			System.out.println("Tema je svetla");
		}
		
		System.out.println("Vrednost atribuda je " + vrednost);
		
		  new Actions(driver).keyDown(Keys.CONTROL).sendKeys("k").perform();
		WebElement pretraga = driver.findElement(By.id("docsearch-input"));
		pretraga.getAttribute("type");
		
		if(pretraga.equals("search")) {
			System.out.println("Type je search");
		}else {
			System.out.println("Type nije search");
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
