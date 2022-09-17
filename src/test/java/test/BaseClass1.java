


	package test;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class BaseClass1 {
		
		WebDriver driver;
		

		
		
		
		@BeforeMethod
		public void SetUp() {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
		}
		
		
		@AfterMethod
		public void TearDown() {
			
			//Step7: Close the browser
			driver.close();
		}

	}



