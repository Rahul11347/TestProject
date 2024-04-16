package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenShot2 {

	TakeScreenShot1 t1 = new TakeScreenShot1();

	@Test
	public void doLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(2000);
		t1.driver.get("https://www.facebook.com/");

		t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.id("passsssss")).sendKeys("abc12345");

	}

	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception
	{
		t1.CaptureScreenShot(result2);
	}

}
