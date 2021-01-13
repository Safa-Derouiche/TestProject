package JUnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {


	WebDriver driver;

	@Before
	public void initRun() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	public void tesxtMustExistsinGooGleTitle1() {

		// Assert.assertTrue(driver.getTitle().contains("Go"));

		assertTextPresentInTitle("Go");

	}

	@Test
	public void tesxtMustExistsinGooGleTitle2() {

		// Assert.assertTrue(driver.getTitle().contains("oo"));

		assertTextPresentInTitle("oo");

	}

	@Test
	public void testNotExistsGooGleTitle() {

		Assert.assertFalse(driver.getTitle().contains("AZIZ"));

	}

	public void assertTextPresentInTitle(String expectedResult) {

		Assert.assertTrue(driver.getTitle().contains(expectedResult));
	}

}

