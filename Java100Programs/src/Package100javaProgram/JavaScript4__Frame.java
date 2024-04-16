package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript4__Frame {

	public static void main(String[] args) throws Exception {

		/*
		 * findElements using By.tagName and CountNoOfFrames --> WebElement find into
		 * Each and every frame
		 */

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.paytm.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		int AllFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total No of cell available:-     " + AllFrames);

		// Go inside Each frame and check if Element Present

		for (int i = 0; i < AllFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);

			// from onward this code will not work bc video link is disappear from paytm
			driver.findElement(By.xpath("")).click();

			Thread.sleep(2000);
			driver.close();
		}

	}

}
