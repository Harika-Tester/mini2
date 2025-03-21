package Flightbooking;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightbooking1 
{
	//driver.navigate().to("https://www.easemytrip.com/flights.html?adgroupid=1154488195734144&device=c&msclkid=700bbf101de51600c96bd8d98249735b&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_Search_ALLAudience_NonBrand_Airline%3ASpicejet_Airline&utm_term=spicejet&utm_content=Spicejet_Desktop");
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="")
	WebElement flightTab;
	
	@FindBy(xpath="")
	WebElement flightType;
	
	@FindBy(xpath="")
	WebElement fromField;
	
	@FindBy(xpath="")
	WebElement writeFromField;

	@FindBy(xpath="")
	WebElement selectFromSuggestion;
	
	@FindBy(xpath="")
	WebElement toField;
	
	@FindBy(xpath="")
	WebElement selectToSuggestion;

	public  void FlightPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightTab()
	{
		flightTab.click();
	}
	
	public void clickOnRoundTrip()
	{
		flightType.click();
	}

	public void cities (String from, String to)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		fromField.click();
		writeFromField.sendKeys(from);
		selectFromSuggestion.click();
		toField.sendKeys(to);
		selectToSuggestion.click();
	}

	public static void main(String[] args) {
		
	}

}
