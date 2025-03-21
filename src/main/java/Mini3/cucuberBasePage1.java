package Mini3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cucuberBasePage1 {

	public static WebDriver driver;
	
	public static void launchApplication(String Browser)
	{
		if(Browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https:/studio.cucumber.io/users/sign_in");
		}
		else if(Browser.equals("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//driver=new Firefoxdriver();
			driver.get("https:/studio.cucumber.io/users/sign_in");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
}
