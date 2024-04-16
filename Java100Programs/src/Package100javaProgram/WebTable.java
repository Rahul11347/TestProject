package Package100javaProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> TotalComp = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		System.out.println(TotalComp.size());

		List<WebElement> Totalcurrentrate = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(Totalcurrentrate.size());

		String ExpResult = "Inflame Appliances";
		for (int i = 0; i < TotalComp.size(); i++) {
			if (TotalComp.get(i).getText().equalsIgnoreCase(ExpResult)) {

				System.out.println("Company Name     	: =  " + TotalComp.get(i).getText());
				System.out.println("Company Current Name : =  " + Totalcurrentrate.get(i).getText());
				TotalComp.get(i).click();
				break;

			}

		}

	}
}
