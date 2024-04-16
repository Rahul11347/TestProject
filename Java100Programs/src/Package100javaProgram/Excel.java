package Package100javaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of file
		File src= new File("E:\\Software\\DemoExcel.xlsx");
		
		//Create FileInputStream Class object to load the file
		FileInputStream fis = new FileInputStream(src);
		
		//load the WorkSheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	
		//load workSheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		System.out.println(sh.getSheetName());
		
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());	//print String
		System.out.println(sh.getRow(1).getCell(1).getNumericCellValue());	//print Numeric
		
		int a = (int)sh.getRow(1).getCell(3).getNumericCellValue();			//Convert Double to int and print
		
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getLastRowNum() + 1);
		
		System.out.println(sh.getRow(1).getPhysicalNumberOfCells());
		System.out.println(sh.getRow(2).getLastCellNum());
		
		
		
		//OpenBrowser instance
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		String Name = sh.getRow(1).getCell(0).getStringCellValue();	
		String TestData = sh.getRow(2).getCell(0).getStringCellValue();	
		
		
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(TestData);
		
		
		
		
	}

}
