package Package100javaProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript5__PopUpHandling {

	public static void main(String[] args) throws Exception {

		/* use Set<String> instead of List<String>    bcz GetWindowHandles only support Set not a List
		 * Iterator use as a Loop concept
		 * abc.next(); 
		 * print WindowID and Title
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		//driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();

		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println(allWindowID);

		Iterator<String> abc = allWindowID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();

		// print Details of Parent Window
		driver.switchTo().window(win1);
		System.out.println("parent Window ID =  " + win1);
		System.out.println(driver.getTitle());

		// print Details of Child Window
		driver.switchTo().window(win2);
		System.out.println("Child Window ID =  " + win2);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
