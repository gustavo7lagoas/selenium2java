package selenium2Project.selenium2Project.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {
	
	WebDriver driver;
	
	@FindBy(how = How.ID, using="email")
	WebElement email;
	
	@FindBy(how = How.ID, using="pass")
	WebElement pass;
	
	@FindBy(how = How.ID, using="loginbutton")
	WebElement loginButton;

	public FacebookLoginPage(WebDriver selenium) {
		driver = selenium;
	}
	
	/***
	 * informs email or phone for login
	 * 
	 * @param username
	 * @return FacebookLoginPage instance
	 */
	public FacebookLoginPage informLogin(String username) {
		email.sendKeys(username);
		return this;
	}
	
	/***
	 * informs password for login
	 * 
	 * @param username
	 * @return FacebookLoginPage instance
	 */
	public FacebookLoginPage informPass(String password) {
		pass.sendKeys(password);
		return this;
	}
	
	/***
	 * clicks log in button
	 * 
	 * @param username
	 * @return FacebookLoginPage instance
	 */
	public FacebookLoginPage clickLogin() {
		loginButton.click();
		return this;
	}
	
	/***
	 * performs login for email/phone and password
	 * 
	 * @param username
	 * @return FacebookLoginPage instance
	 */
	public FacebookLoginPage loginWith(String username, String password) {
		this.informLogin(username).informPass(password).clickLogin();
		return this;
	}
}
