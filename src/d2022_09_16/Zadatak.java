package d2022_09_16;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak {
	/*Zadatak
Napisati program koji ima:
Podesava:
implicitno cekanje za trazenje elemenata od 10s
implicitno cekanje za ucitavanje stranice od 10s
eksplicitno cekanje podeseno na 10s
Podaci:
Potrebno je u projektu ukljuciti 4 slike.
Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
Koraci:
Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
Maksimizuje prozor
Selektuje Image - Front klikom na tu karticu u dnu ekrana
Klik na add photo iz levog navigacionog menia
Upload slike. Upload preko File objekta koristeci getAbsolutePath
Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljanje
Ceka da dijalog bude vidljiv
Klik na Use One Side Only dugme
Ceka da se pojavi dijalog sa slikom
Klik na Done
Ponoviti proces za Left, Right i Back
Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
Kliknuti na Add To Cart dugme
Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
Xpath: //*[@action='error']  
Zatvorite pretrazivac
*/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 new Actions(driver).keyDown(Keys.CONTROL).sendKeys("-").perform();
		 // OVAJ KORAK MI JE NEOPHODAN JER NE POSTOJI MOGUCNOST ZA SCROLL DOK NE UMANJIM. 
		 //NE ZNAM DA LI POSTOJI NEKA METODA MOZDA?
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@alt='image 1']")).click();
//		driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();
//		driver.findElement(By.id("imageUpload")).sendKeys(new File("img/front_Nikola.jpg").getAbsolutePath());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'fqhTDx')]/div[1]/div/img")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]/div")));
//		driver.findElement(By.xpath("//div[contains(@class, 'bbpaUa')]/button[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'ckRsqX')]")));
//		new Actions (driver).scrollToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		new Actions (driver).moveToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")).click();
//		
//		driver.findElement(By.xpath("//img[@alt='image 2']")).click();
//		driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();
//		driver.findElement(By.id("imageUpload")).sendKeys(new File("img/back_Nikola.jpg").getAbsolutePath());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'fqhTDx')]/div[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]/div[2]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'bbpaUa')]/button[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'ckRsqX')]")));
//		new Actions (driver).scrollToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		new Actions (driver).moveToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")).click();
//		
//		driver.findElement(By.xpath("//img[@alt='image 3']")).click();
//		driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();
//		driver.findElement(By.id("imageUpload")).sendKeys(new File("img/right_Nikola.jpg").getAbsolutePath());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'fqhTDx')]/div[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]/div[3]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'bbpaUa')]/button[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'ckRsqX')]")));
//		new Actions (driver).scrollToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		new Actions (driver).moveToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")).click();
//		
//		driver.findElement(By.xpath("//img[@alt='image 4']")).click();
//		driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();
//		driver.findElement(By.id("imageUpload")).sendKeys(new File("img/left_Nikola.jpg").getAbsolutePath());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'fqhTDx')]/div[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'fqhTDx')]/div[4]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'bbpaUa')]/button[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'ckRsqX')]")));
//		new Actions (driver).scrollToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		new Actions (driver).moveToElement(driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'ckRsqX')]/div/div/div[2]")).click();
		
		File front = new File("img/front_Nikola.jpg");
		File left = new File("img/left_Nikola.jpg");
		File right = new File("img/right_Nikola.jpg");
		File back = new File("img/back_Nikola.jpg");
		
		ArrayList<File> slike = new ArrayList<File>();
		slike.add(front);
		slike.add(left);
		slike.add(right);
		slike.add(back);
		 new Actions(driver).keyDown(Keys.CONTROL).sendKeys("-").perform();
		for(int i = 0; i < slike.size(); i++) {
			driver.findElement(By.xpath("//div[contains(@class, 'iltlXU')]/div["  + (i +1) + "]")).click();
			driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();
			driver.findElement(By.id("imageUpload")).sendKeys(slike.get(i).getAbsolutePath());
			wait.until(ExpectedConditions
					.numberOfElementsToBe(By.xpath("//div[contains(@class, 'sc-ftvSup fqhTDx')]//img"), i + 1));
			driver.findElement(By.xpath("//div[contains(@class, 'sc-gKXOVf bNhUVa')][1]//img")).click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Use One Side Only']")));
			driver.findElement(By.xpath("//button[text() = 'Use One Side Only']")).click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'reactEasyCrop_Container')]")));
			driver.findElement(By.xpath("//button[text() = 'Done']")).click();
		}
		
		Random r = new Random();
		List<WebElement> listaKonfeta = 
				driver.findElements(By.xpath("//div[contains(@class, 'kFlYLE')]//div[contains(@class, 'sc-ewDcJz')]"));
		int konfeti = r.nextInt(listaKonfeta.size());
		listaKonfeta.get(konfeti).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Add to cart')]")).click();
		boolean pojaviloSe = true;
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@action = 'error']")));
		} catch (Exception e) {
			pojaviloSe = false;
		}

		if (pojaviloSe) {
			System.out.println("Pojavila se greska!");
		} else {
			System.out.println("Greska se nije pojavila!");
		}
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
