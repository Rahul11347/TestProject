package Package100javaProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();

		List<WebElement> we = driver.findElements(By.xpath("//label[@class='_58mt']"));

		System.out.println(we.size());
		Thread.sleep(2000);
		we.get(0).click();
		Thread.sleep(2000);
		we.get(1).click();
		Thread.sleep(2000);
		we.get(2).click();

		System.out.println(we.get(1).isSelected());
		System.out.println(we.get(1).isEnabled());
		System.out.println(we.get(1).isDisplayed());

		String ExpResult = "Male";

		for (int i = 0; i < we.size(); i++) {
			if (we.get(i).getText().equalsIgnoreCase(ExpResult)) {

				we.get(i).click();
				break;

			}

		}

	}

}
