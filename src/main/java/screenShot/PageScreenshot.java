package screenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class PageScreenshot extends BaseClassLucky
{

	GenericMethodsLu Gm= new GenericMethodsLu();
	public static By EmailID=By.xpath("//input[@name='email']");
	
	public static By PassWordID=By.xpath("//input[@name='pass']");
	public static By Button= By.xpath("//button[@name='login']");
	
	public static void Enter_Emailid(String email)
	{
		Driver.findElement(EmailID).sendKeys(email);
	}
	public static void Enter_password(String password)
	{
		Driver.findElement(PassWordID).sendKeys(password);
			
	}
	public static void Login()
	{
		GenericMethodsLu Gm= new GenericMethodsLu();
		WebElement Button1= Driver.findElement( Button);
		Gm.explictWait(3, Button1);	
	}
}
