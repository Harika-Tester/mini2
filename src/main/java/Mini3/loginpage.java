package Mini3;

import org.openqa.selenium.By;

public class loginpage extends Basicpro
{

	public static By emailid=By.id("email");
	public static By passwordid=By.name("pass");
	public static By ButtonLogin=By.name("Login");
	
	public static void Enter_email(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}
	
	public static void Enter_password(String password)
	{
		driver.findElement(passwordid).sendKeys(password);
	}
	
	public static void clickLogin()
	{
		driver.findElement(ButtonLogin).click();
	}
	
	}
