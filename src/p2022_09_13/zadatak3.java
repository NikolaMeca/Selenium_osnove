package p2022_09_13;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ArrayList<String> sajtovi = new ArrayList<>();
		sajtovi.add("https://google.com/");
		sajtovi.add("https://youtube.com/");
		sajtovi.add("https://www.ebay.com/");
		sajtovi.add("https://www.kupujemprodajem.com/");
		for(int i =0; i < sajtovi.size(); i++) {
			driver.get(sajtovi.get(i));
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
