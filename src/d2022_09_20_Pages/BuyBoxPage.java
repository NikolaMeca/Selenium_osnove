package d2022_09_20_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyBoxPage {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public BuyBoxPage (WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
	}
	public WebElement getInputZaKolicinu() {
		return driver.findElement(By.id("quantity_wanted"));
	}
	public WebElement getSelectZaVelicinu() {
		return driver.findElement(By.id("group_1"));
	}
	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("//p[contains(@id, 'add_to_cart')]/button"));
	}
	public WebElement getWishlistButton() {
		return driver.findElement(By.id("wishlist_button"));
	}
	public WebElement getElementBoje(String boja) {
		return driver.findElement(By.xpath
				("//ul[@id='color_to_pick_list']//a[@title='" + boja +"']"));
	}
	public WebElement getSccrolaDoMestaGdeSeNalazeBoje() {
		new Actions (driver).scrollToElement(driver.findElement(By.xpath
				("//div[contains(@class, 'button-container')]/span")));
		return driver.findElement(By.xpath
				("//div[contains(@class, 'button-container')]/span"));
	}

	public WebElement getCenaZaJedanElement() {
		return this.driver.findElement(By.id("our_price_display"));
	}
	
	
}
