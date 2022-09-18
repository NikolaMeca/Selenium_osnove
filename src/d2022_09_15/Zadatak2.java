package d2022_09_15;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
	/*1.Zad
Napisati program koji:
Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element
 obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI PETLJOM)
POMOC: Brisite elemente odozdo.
(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		driver.get("https://s.bootsnipp.com/iframe/Dq2X");
		List<WebElement> iksevi = driver.findElements(By.xpath("//*[@class='close']"));
		boolean nestao = true;
		
		for(int i = iksevi.size() - 1; i >= 0; i--) {
			iksevi.get(i).click();
			try {
				 driver.findElement(By.className("close")).isDisplayed();
			}catch(Exception e) {
				nestao = false;
			}

		}
		if (nestao) {
			System.out.println("Element je nestao");
		}else {
			System.out.println("Element nije nestao");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

