package Mini3;

import org.openqa.selenium.By;

public class AdityLoginPage extends cucuberBasePage1
{
	
public static By loginButton=By.xpath("");

public static By emailIdTexBox=By.id("");

public static By userPasswordTextBox=By.id("");

public static By signinButton=By.name("");

public static By invalidErrorMessage=By.xpath("");

public static void clickLoginButton()
	{
	try
	{
		driver.findElement(loginButton).click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
}
