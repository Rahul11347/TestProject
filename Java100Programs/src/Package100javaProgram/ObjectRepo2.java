package Package100javaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo2 {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of File
		File src1 = new File("E:\\Java Projects using Eclipse\\Practice12202023\\Repository\\Config.properties");
		File src2 = new File("E:\\Java Projects using Eclipse\\Practice12202023\\Repository\\locators.properties");
		File src3 = new File("E:\\Java Projects using Eclipse\\Practice12202023\\Repository\\TestData.properties");
		
		
		//FileInputStream to load the file
		FileInputStream fis1 = new FileInputStream(src1);
		FileInputStream fis2 = new FileInputStream(src2);
		FileInputStream fis3 = new FileInputStream(src3);
		
		//Property class to read the file
		Properties pro1 = new Properties();
		Properties pro2 = new Properties();
		Properties pro3 = new Properties();
		
		pro1.load(fis1);
		pro2.load(fis2);
		pro3.load(fis3);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get(pro1.getProperty("URL"));
		
		
		
		driver.findElement(By.xpath(pro2.getProperty("locator1"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("locator2"))).sendKeys(pro3.getProperty("TestData2"));
		
		
		
	}

}
