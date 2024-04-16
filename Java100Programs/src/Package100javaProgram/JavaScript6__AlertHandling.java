package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class JavaScript6__AlertHandling {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		// Alert Handling
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		
		//verifyAlert Text
		
		String AlertText = driver.switchTo().alert().getText();
		String ExpResult ="Do you confirm action?";
		Assert.assertEquals(AlertText, ExpResult);
		System.out.println("Alert Text Verified");

		
		
		
		//Accept the Alert
		driver.switchTo().alert().accept();
		System.out.println("Alert accept");

		
		
		
		
		//Dismiss the Alert
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
