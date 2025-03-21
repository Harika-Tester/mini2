package Flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flight
{
public static WebDriver driver;
public static void application_Launch()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.navigate().to("https://www.easemytrip.com/flights.html?adgroupid=1154488195734144&device=c&msclkid=700bbf101de51600c96bd8d98249735b&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_Search_ALLAudience_NonBrand_Airline%3ASpicejet_Airline&utm_term=spicejet&utm_content=Spicejet_Desktop");
	driver.manage().window().maximize();
	
	}
	
	

}
