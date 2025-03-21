package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethodsLu extends BaseClassLucky
{


		public static String captureScreenShot() throws IOException 
		{
			TakesScreenshot tc=((TakesScreenshot)BaseClassLucky.Driver);
			
			File scrfile=tc.getScreenshotAs(OutputType.FILE);
			
			File destfile=new File("D://prints//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
			
			FileUtils.copyFile(scrfile, destfile);
			
		String srcpath=destfile.getAbsolutePath();
			
			return srcpath;
		}
		
		
		
		public static void explictWait(int time, WebElement button1)
		{
			
			 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(time));
		    wait.until(ExpectedConditions.elementToBeClickable(button1));
		    button1.click();
		}
	}


