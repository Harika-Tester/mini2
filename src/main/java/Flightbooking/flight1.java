package Flightbooking;

import org.openqa.selenium.By;

public class flight1 extends flight
{
	public static By Emailid=By.xpath("//input[@id='user_email']");
	  
	  public static By Passwordid=By.xpath("//input[@id='user_password']");
	  
	  public static By SubmitButtonSignin=By.xpath("//input[@name='commit']");
	  
	  public static By invalidErrorMassage=By.xpath("//p[text()='Invalid email or password.']");
	  
	  public static void EnterEmail(String email)
	  {
		  driver.findElement(Emailid).sendKeys(email);
	  }
		
	  public static void EnterPassword(String password)
	  {
		  driver.findElement(Passwordid).sendKeys(password);
	  }

	  public static void SubmitButtonSignin()
	  {
		  driver.findElement(SubmitButtonSignin).click();
	  }
public static By ButtonOneWay=By.name("OneWay");
public static By FROMid=By.id(" From");
public static By TOid=By.id("TO");

	public static void clickOneWay()
	{
	driver.findElement(ButtonOneWay).click();
	}
	public static void Enter_FROM(String From)
	{
		driver.findElement(FROMid).sendKeys(From);
	}
	public static void Enter_TO(String To)
	{
		driver.findElement(TOid).sendKeys(To);
	}


	
}
