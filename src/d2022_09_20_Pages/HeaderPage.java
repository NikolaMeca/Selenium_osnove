package d2022_09_20_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public HeaderPage (WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
	}
	
	public WebElement getShopPhone() {
		return driver.findElement(By.className("shop-phone"));
	}
	public WebElement getContactUs() {
		return driver.findElement(By.id("contact-link"));
	}
	public WebElement getSignIn() {
		return driver.findElement(By.className("header_user_info"));
	}
	
}
