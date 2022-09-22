package d2022_09_20_Tests;

import static org.testng.Assert.expectThrows;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import d2022_09_20_Pages.BuyBoxPage;
import d2022_09_20_Pages.HeaderPage;
import d2022_09_20_Pages.LayerCartPage;
import d2022_09_20_Pages.TopMenuPage;

public class AutomationPracticeTests {
	private WebDriver driver;
	private WebDriverWait wait;
	private BuyBoxPage buyBoxPage;
	private LayerCartPage layerCartPage;
	private TopMenuPage topMenuPage;
	private HeaderPage headerPage;
	private SoftAssert softAssert;
	String baseUrl = "http://automationpractice.com";
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		buyBoxPage = new BuyBoxPage(driver, wait);
		layerCartPage = new LayerCartPage(driver, wait);
		topMenuPage = new TopMenuPage(driver, wait);
		headerPage = new HeaderPage(driver, wait);
		softAssert = new SoftAssert();
		
//		driver.get(url);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get(baseUrl);
	}
	
//	@Test(priority = 10)
//	public void  addingProductToTheCart() throws InterruptedException {
//		
//		driver.get(baseUrl + "/index.php?id_product=1&controller=product");
//		Thread.sleep(5000);
//		buyBoxPage.getSccrolaDoMestaGdeSeNalazeBoje();
//		buyBoxPage.getInputZaKolicinu().clear();
//		buyBoxPage.getInputZaKolicinu().sendKeys("3");
//		buyBoxPage.getSelectZaVelicinu().sendKeys("L");
//		buyBoxPage.getElementBoje("Blue").click();
//		buyBoxPage.getAddToCart().click();
//		Thread.sleep(5000);
//		layerCartPage.getCekaDaDijalogBudeVidljiv();
//		
//		Assert.assertEquals(layerCartPage.getQuantity()
//				.getText(), "3", "Should be number 3 in input");
//		Assert.assertTrue(layerCartPage.getatributProizvoda().getText()
//				.contains("L"), "Should be size L");
//		Assert.assertTrue(layerCartPage.getatributProizvoda().getText()
//				.contains("Blue"), "Should be Blue color");
//		
//		double cenaZaOcekivaneProizvode = Double.valueOf(layerCartPage.getTotalPrice().getText().substring(1));
//		double cenaZaJedanProizvod1 = Double.valueOf(buyBoxPage.getCenaZaJedanElement()
//				.getText().substring(1));
//		Assert.assertEquals(cenaZaOcekivaneProizvode, (cenaZaJedanProizvod1 * 3)
//				, "Should price all Pice higer then price for one product");
//		layerCartPage.getScrollaDoCountinueShopingButton().click();
//		layerCartPage.getCekaDaDijalogNeBudeVidljiv();
//		
//		buyBoxPage.getAddToCart().click();
//		buyBoxPage.getInputZaKolicinu().clear();
//		buyBoxPage.getInputZaKolicinu().sendKeys("1");
//		buyBoxPage.getSelectZaVelicinu().sendKeys("L");
//		buyBoxPage.getElementBoje("Orange").click();
//		Thread.sleep(2000);
//		buyBoxPage.getAddToCart().click();
//		layerCartPage.getCekaDaDijalogBudeVidljiv();
//		layerCartPage.getProcedToCheckoutButton().click();
//		
//		Assert.assertTrue(driver.getTitle().contains("Order - My Store"));
//	}
//	@Test (priority = 20)
//	public void TopMenuMouseOver() throws InterruptedException {
//		WebElement hoverable = topMenuPage.getWomenLink();
//		new Actions(driver).moveToElement(hoverable).perform();
//		Assert.assertTrue(topMenuPage.getSubMenuWomen().isDisplayed());
//		new Actions(driver).moveToElement(topMenuPage.getDressesLink()).perform();
//		Assert.assertTrue(topMenuPage.getSubMenuDresses().isDisplayed());
//		new Actions(driver).moveToElement(topMenuPage.getTShirtsLink()).perform();
//		Thread.sleep(5000);
//		Assert.assertFalse(topMenuPage.getSubMenuDresses().isDisplayed());
//		Assert.assertFalse(topMenuPage.getSubMenuWomen().isDisplayed());
//	}
	@Test (priority = 30)
	public void PhoneNumberVisibilityCheckOnResize() throws InterruptedException {
		Assert.assertTrue(headerPage.getShopPhone().isDisplayed());
		Dimension dimension = new Dimension(767, 700);
		driver.manage().window().setSize(dimension);
		Assert.assertFalse(headerPage.getShopPhone().isDisplayed());
		
		Dimension dimension2 = new Dimension(784, 700);
		Thread.sleep(2000);
		driver.manage().window().setSize(dimension2);
		Thread.sleep(2000);
		Assert.assertTrue(headerPage.getShopPhone().isDisplayed());
		driver.manage().window().maximize();
		
		softAssert.assertAll();
	}
	@Test (priority = 40)
	public void  HeaderLinksCheck() {
		headerPage.getContactUs().click();
		Assert.assertTrue(driver.getTitle().contains("Contact us - My Store"));
		headerPage.getSignIn().click();
		Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
		
		softAssert.assertAll();
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	
	
	
	
	
	
}
