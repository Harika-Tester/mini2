package screenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassLucky 
{

	 public static WebDriver Driver;
	 
	 
		public static void application_launch()
		{	
			WebDriverManager.chromedriver().setup();	
			Driver= new ChromeDriver();
			Driver.get("https://www.fb.com");	
		}
		
		public static void application_close()
		{
			
			Driver.close();
		}
	
	
}
