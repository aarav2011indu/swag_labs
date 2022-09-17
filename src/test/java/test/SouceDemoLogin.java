package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Pages.LoginPage1;

public class SouceDemoLogin  extends BaseClass1 {
	@Test
	
public void Test1(){
		
	LoginPage1 lp = new LoginPage1(driver);
	lp.Login("abc@xyz", "Test@1234");
	
	
	
	WebElement Error = driver.findElement(By.xpath("//*[@data-test='error']"));
	String ActError = Error.getText();
	
	System.out.println(ActError);
	
//	Assert.assertEquals(ActError, "Epic sadface: Username and password do not match any user in this service");	
	
//	lp.Login("standard_user", "secret_sauce");
//	
//	
//	String producttitle = driver.findElement(By.cssSelector(".title")).getText();
//	System.out.println(producttitle);
//	Assert.assertEquals(producttitle, "PRODUCTS");
	
		
}
	@Test
	public void Test2() {
		LoginPage1 lp = new LoginPage1(driver);
		lp.Login("standard_user", "secret_sauce");
		
		
		String producttitle = driver.findElement(By.cssSelector(".title")).getText();
		System.out.println(producttitle);
		Assert.assertEquals(producttitle, "PRODUCTS");
		
		
		
		
		
		
		
	}
}
