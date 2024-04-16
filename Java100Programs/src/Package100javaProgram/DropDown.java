package Package100javaProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		// create List of WebElement
		List<WebElement> lwe1 = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
		System.out.println(lwe1.size());
		lwe1.get(0).click();

		// create WebElement
		WebElement we1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		we1.sendKeys("Aug");

		Select sc1 = new Select(we1);
		sc1.selectByIndex(9);
		sc1.selectByValue("11");
		sc1.selectByVisibleText("Sep");
		
		
	}

}
