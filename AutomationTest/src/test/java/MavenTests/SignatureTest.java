package MavenTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignatureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://szimek.github.io/signature_pad/");

		driver.manage().window().maximize();
		// replace thread sleep()

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/canvas[1]"));

		Actions draw = new Actions(driver);

		Action drawAction = draw.moveToElement(element, 50, 50) // start point
				.clickAndHold(element).moveByOffset(100, 60).moveByOffset(0, 0).moveByOffset(0, 90).moveByOffset(90, 50)
				.moveByOffset(100, 0).moveByOffset(-300, 0).moveByOffset(-50, -200).release(element) // second point
				.build();

		drawAction.perform();
		// créer la chaine ( build ) + executer le tout ( perform )

		// element.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/button[1]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		// methode 1
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/button[1]"))).click();
		// //wait until DOM charge it

		// methode 2

		WebElement el = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/button[1]")));

		el.click();

	}

}
