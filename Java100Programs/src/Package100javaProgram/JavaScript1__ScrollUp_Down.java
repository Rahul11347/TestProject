package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1__ScrollUp_Down {

	public static void main(String[] args) throws Exception {
		// LocateWebElement and send value
		// scroll window

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@gmail,com'");
		jse.executeScript("document.getElementById('pass').value='123456'");

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");

	}

}
