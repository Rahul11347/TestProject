package Package100javaProgram;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShot1 {

	WebDriver driver;

	public void CaptureScreenShot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File SourceFile = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(SourceFile, new File("./ScreenShot/" + result.getName() + ".png"));

			System.out.println(result.getName() + "method() screenshotCaptured");

		}

	}

}
