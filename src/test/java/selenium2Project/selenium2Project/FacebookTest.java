package selenium2Project.selenium2Project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import selenium2Project.selenium2Project.PageObjects.FacebookLoginPage;
import selenium2Project.selenium2Project.PageObjects.FacebookProfilePage;
import selenium2Project.selenium2Project.Support.TestProperties;

public class FacebookTest {
	
	public static WebDriver driver;
	public FacebookLoginPage facebookLoginPage;
	public FacebookProfilePage facebookProfilePage;
	public TestProperties testProperties;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		testProperties = new TestProperties("credentials.properties");
		facebookLoginPage = PageFactory.initElements(driver, FacebookLoginPage.class);
	}
	
	@Test
	public void HelloWorldPostTest() {
		facebookLoginPage.loginWith(testProperties.prop.getProperty("username"),
				testProperties.prop.getProperty("password"));
		facebookProfilePage = PageFactory.initElements(driver, FacebookProfilePage.class);
		facebookProfilePage.postIt("Hello World");
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}