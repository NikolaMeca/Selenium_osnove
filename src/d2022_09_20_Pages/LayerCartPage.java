package d2022_09_20_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LayerCartPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public LayerCartPage (WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
	}
	public WebElement getScrollaDoCountinueShopingButton() {
//		new Actions (driver).scrollToElement((WebElement) By.xpath("//div[contains(@class, 'button-container')]/span"));
		return driver.findElement(By.xpath("//div[contains(@class, 'button-container')]/span"));
	}
	public WebElement getProcedToCheckoutButton() {
//		new Actions(driver).scrollToElement((WebElement) By.xpath("//a[contains(@title, 'Proceed')]"));
		return driver.findElement(By.xpath("//a[contains(@title, 'Proceed')]"));
	}
	public WebElement getatributProizvoda() {
		return driver.findElement(By.xpath("//div[contains(@class, 'layer_cart_product_info')]"));
	}
	public WebElement getQuantity() {
		return driver.findElement(By.id("layer_cart_product_quantity"));
	}
	public WebElement getTotalPrice() {
		return driver.findElement(By.id("layer_cart_product_price"));
	}
	public void getCekaDaDijalogBudeVidljiv() {
		
		this.wait.until(ExpectedConditions.visibilityOf(getScrollaDoCountinueShopingButton()));
	}
	public void getCekaDaDijalogNeBudeVidljiv() {
		this.wait.until(ExpectedConditions.invisibilityOf(getScrollaDoCountinueShopingButton()));
	}
	
	
}
