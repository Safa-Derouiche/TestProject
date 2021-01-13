package MavenTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://explore.zoom.us/fr-fr/gartner.html");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		d.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Safa");
		d.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Derouiche");
		d.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ");
		WebElement el = d.findElement(By.xpath("//select[@id='emp_count']"));
		JavascriptExecutor js = (JavascriptExecutor) d; // (cast)
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid blue;')", el);

		Select sel = new Select(el);
		sel.selectByVisibleText("251-500");
		d.findElement(By.xpath("//select[@id='country']")).sendKeys("Tunisia");
		d.findElement(By.xpath("//input[@id='city']")).sendKeys("0000");
		d.findElement(By.xpath("//a[@id='btnSubmit']")).click();
		// List<WebElement> options = sel.getOptions(); à rechercher

	}

}
