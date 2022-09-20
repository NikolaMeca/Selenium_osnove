package d2022_09_19;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BootstrapTableTests {
	private WebDriver driver;
	private WebDriverWait wait;
	private String url = "https://s.bootsnipp.com";
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.get(url);
	}
	@BeforeMethod
	public void stranica() {
		
	}
	
	@Test (priority = 10)
	public void  EditRow() {
		driver.get(url + "/iframe/K5yrx");
		String actualTitle = driver.getTitle();
		String exceptedTitle = "Table with Edit and Update Data - Bootsnipp.com";
		Assert.assertEquals(actualTitle, exceptedTitle, "Error: should contains text Table with Edit and Update Data - Bootsnipp.com");
		driver.findElement(By.xpath("//tbody/tr[1]//td//button[1][contains(@data-target, '#edit')][1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'modal-body')]/input")));
		driver.findElement(By.id("fn")).clear();
		driver.findElement(By.id("fn")).sendKeys("Nikola");
		driver.findElement(By.id("ln")).clear();
		driver.findElement(By.id("ln")).sendKeys("Milosavljevic");
		driver.findElement(By.id("mn")).clear();
		driver.findElement(By.id("mn")).sendKeys("Velislav");
		driver.findElement(By.id("up")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated
				(By.xpath("//div[contains(@class, 'modal-body')]/input")));
		String actualName = driver.findElement(By.id("f1")).getText();
		String expectedName = "Nikola";
		boolean ime = actualName.contains(expectedName);
		Assert.assertTrue(ime);
		Assert.assertTrue(driver.findElement
				(By.id("f1")).getText().contains("Nikola"), "Error: FirstName should be Nikola");
		String actualPrez = driver.findElement(By.id("l1")).getText();
		String expectedPrez = "Milosavljevic";
		boolean prezime = actualPrez.contains(expectedPrez);
		Assert.assertTrue(prezime);
		Assert.assertTrue(driver.findElement
				(By.id("l1")).getText().contains("Milosavljevic"), "Error: LastName should be Milosavljevic");
		Assert.assertTrue(driver.findElement
				(By.id("m1")).getText().contains("Velislav"), "Error: MidName should be Velislav");
				
	}
	
	@Test (priority = 20)
	public void DeleteRow() {
		driver.get(url + "/iframe/K5yrx");
		Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com",
				"Error: Title should be Table with Edit and Update Data - Bootsnipp.com");
		
//		List<WebElement> redovi = driver.findElements(By.xpath("//tbody/tr"));
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/button[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("del")));
		driver.findElement(By.id("del")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("del")));
		
		Assert.assertFalse(driver.findElement(By.id("d1")).isDisplayed(), 
				"shouldn't be displayd element tr1");
		
//		List<WebElement> redovi2 = driver.findElements(By.xpath("//tbody/tr"));
//		
//		Assert.assertTrue(redovi.size() > redovi2.size(), 
//		"Error: Should be less number of cells in List redovi2");
		
		
	}
	
	@Test (priority = 30)
	public void  TakeAScreenshot() throws IOException {
		driver.get(url + "/iframe/K5yrx");
		Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com",
				"Error: Title should be Table with Edit and Update Data - Bootsnipp.com");
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File source = scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("src/d2022_09_19/screenshot.png"));
		
		
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
