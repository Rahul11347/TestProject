package Package100javaProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript3__DragAndDrop {
	
public static void main(String[] args) throws Exception {
		
		/*         Switch Frame --> create WebElementRef --> ActionClass --> dragAnddrop                       */
		//DragAndDrop
		//DragAndHold
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		//switching Frame
		driver.switchTo().frame(0);
		
		//create WebElementRef of draggable
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//create WebElementRef of draggable
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Actions Class
		Actions act = new Actions(driver);
		
		//dragAndDrop
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).build().perform();		
		
		Thread.sleep(2000);
		act.dragAndDropBy(drag, 60,100).build().perform();
		
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 60,100).build().perform();
		
	}
	

}
