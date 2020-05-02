package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.juicePlusTest.PO.DriverMain;

public class GetScreenshot extends DriverMain {

	public static String capture(String screenshotName) throws IOException {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = "D:\\SCREENSHOTS\\"+screenshotName+".png";
	       File destination = new File(dest);
	        FileUtils.copyFile(source, destination);
	 
	        return dest;
	        
	}

}
