package Pages;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class LoginPage1 
{




WebDriver driver ;
	
	//************************ Objects *******************************
	
	
	@FindBy(name = "user-name")
	WebElement Username;
	
	@FindBy(id = "password")
	WebElement Password;
	
	
	
	@FindBy(name = "login_button")
	WebElement Login;
	
	@FindBy(id = "login-button")
	WebElement Swaglabloginbtn;
	
	public LoginPage1(WebDriver basedriver) {
		
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	// ***************** Methods **************************************
	
	public void Login(String UserNameVal, String PassVal) {

		// Step1. Click on the Login Link
		
Username.clear();

		// Step2: Enter Username
		Username.sendKeys(UserNameVal);

		// Step3: Enter Password
		Password.clear();
		Password.sendKeys(PassVal);

		// Step4 Click Remember Me checkbox
	

		// Step5: Click pn Login Button
		Swaglabloginbtn.click();
//		Login.click();
	}

	public void Login() {
		// TODO Auto-generated method stub
		
	}
	
	
}




