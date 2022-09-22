package d2022_09_20_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopMenuPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public TopMenuPage (WebDriver driver, WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
	}
	
	public WebElement getWomenLink() {
		return driver.findElement(By.xpath("//a[contains(@title, 'Women')]"));
	}
	public WebElement getDressesLink() {
		return driver.findElement(By.xpath("//div[contains(@id, 'block_top_menu')]/ul/li[2]"));
	}
	public WebElement getTShirtsLink() {
		return driver.findElement(By.xpath("//div[contains(@id, 'block_top_menu')]/ul/li[3]"));
	}
	public WebElement getSubMenuWomen() {
		return driver.findElement(By.xpath("//div[contains(@id, 'block_top_menu')]/ul/li[1]/ul[1]/li"));
	}
	public WebElement getSubMenuDresses() {
		return driver.findElement(By.xpath("//div[contains(@id, 'block_top_menu')]/ul/li[2]/ul/li"));
	}
}
