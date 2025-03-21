package Mini3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicpro
{
public static WebDriver driver;
public static void application_Launch()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https:/www.fb.com");
	driver.manage().window().maximize();
	
	}

public static void Browser_close()
{
	driver.close();
}
	
}
