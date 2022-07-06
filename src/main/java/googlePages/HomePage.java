package googlePages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By Header=By.xpath((""));
	By Title=By.xpath(("//head/title[contains(text(),'Google')]"));
	
	public void verifyTitle() {
		String getTitle= driver.findElement(Title).getText();
		assertEquals("Google",getTitle);
		
	}
}
