package excel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasepagExcel
{
public static WebDriver driver;

	public static void launchApplication(String browser)
	{
		if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver.get("https:/studio.cucumber.io/users/sign_in");
		}
		else if(browser.equals("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//driver=new Firefoxdriver();
			driver.get("https:/studio.cucumber.io/users/sign_in");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
	}
	public static void closeBrowser()
	{
		driver.close();
	}

}
