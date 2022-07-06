package googlePages;

import java.util.concurrent.TimeUnit;
//--
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//--
import org.openqa.selenium.WebDriver;
//--
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//--
import org.openqa.selenium.firefox.FirefoxDriver;
//--
import org.testng.Assert;
//--
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//--
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//--
import org.testng.annotations.Test;


public class NewTest{

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gavin\\Documents\\ValhallaJavaProjects\\drivers\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
		// driver.navigate().to("http://www.google.com");
	}

	/*@AfterClass
	public void afterClass() {
		driver.quit();
	}*/
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gavin\\Documents\\ValhallaJavaProjects\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	@Test
	public void verifySearchButton() {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		// driver.launchapp("http://www.google.com");

		String search_text = "Google Search";
		WebElement search_button = driver.findElement(By.name("btnK"));

		String text = search_button.getAttribute("value");

		Assert.assertEquals(text, search_text, "Text not found!");
	}
	
	@Test
	public void verifySearchResult() {

		driver.get("http://www.google.com");
		// driver.launchapp("http://www.google.com");

		String search_text = "Google Search";
		//WebElement search_button = driver.findElement(By.name("btnK"));

		//String text = search_button.getAttribute("value");

		//Assert.assertEquals(text, search_text, "Text not found!");
		
		driver.findElement(By.xpath("(//input)[6]")).sendKeys(search_text);
		driver.findElement(By.xpath("(//input)[9]")).sendKeys(Keys.ENTER);
	}
	
	
}