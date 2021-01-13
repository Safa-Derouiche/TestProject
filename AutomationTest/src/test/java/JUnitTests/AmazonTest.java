package JUnitTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	WebDriver driver;

	@Test
	public void newAmazonTitleValid() {

		String actualresult = driver.getTitle(); // Act

		String expectedResult = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		Assert.assertEquals(expectedResult, actualresult); // Assert

	}

	@Test
	public void oldAmazonTitleMustFail() {

		String actualresult = driver.getTitle(); // Act

		String expectedResult = " Formation Test Auto ";

		Assert.assertNotEquals(expectedResult, actualresult); // Assert

	}

	@Before

	public void initRun() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
	}

	@After

		public void tearDown() {

		driver.quit();
	
	
	
	}
}
