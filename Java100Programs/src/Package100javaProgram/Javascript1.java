package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://paytm.com/");
		
		/*//Javascript executor
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abc123456'");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");
*/
	/*	
		//mouseHover/Keyboard
		//create WebElement Object of element
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		act.contextClick(fash).build().perform();
		Thread.sleep(2000);
		act.contextClick().build().perform();
	*/
		/*
		//DragAndDrop
		//create WebElement Object of element
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		act.dragAndDropBy(drag, 20, 100).build().perform();
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 20, 100).build().perform();
		*/
		
		/*//Frame
		int Totalframe = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
