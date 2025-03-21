package Mini3;

import Mini3.cucuberBasePage1;

public class cucuberloginpagetestcase extends cucumberPage 
{

	public static void main(String[] args) 
	{
		launchApplication("Chrome");
		
		EnterEmail("Harika@gmail.com");
		
		EnterPassword("1234567890");
		
		SubmitButtonSignin();
		
		String actual= cucumberPage.captureInvalidErrorMessage();
		
		String expected= "invalid email or password.";
		
		if (actual.equals(expected))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		//closeBrowser();
	}



}
