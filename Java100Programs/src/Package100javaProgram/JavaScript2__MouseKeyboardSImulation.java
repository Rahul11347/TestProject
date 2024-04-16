package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript2__MouseKeyboardSImulation {

public static void main(String[] args) throws Exception {
		
		/*         Create WeElementRef --> Action Class --> Apply Operation              */
		
		// MouseHover
		// Left and Right Click
		// Keyboard Operation
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.navigate().refresh();

		// Close Login Window If it's Necessary
		// driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(2000);

		// Create Electronic icon Ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Create Electronic icon Ref
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));

		// Actions Class
		Actions act = new Actions(driver);

		// Mouse Hover to ELelctronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();

		// Mouse Right Click on Web Page
		Thread.sleep(2000);
		act.contextClick().build().perform();

		// perform KeyBoard Operation
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
	}
}
