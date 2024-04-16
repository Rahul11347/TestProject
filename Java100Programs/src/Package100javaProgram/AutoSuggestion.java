package Package100javaProgram;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff Work");

		List<WebElement> AutoSugg = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		System.out.println(AutoSugg.size());

		String ExpResult = "how stuff works quiz";
		for (int i = 0; i < AutoSugg.size(); i++) {
			if (AutoSugg.get(i).getText().equalsIgnoreCase(ExpResult)) {

				AutoSugg.get(i).click();
				break;

			}

		}

	}

}
