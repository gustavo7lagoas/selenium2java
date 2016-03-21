package selenium2Project.selenium2Project.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookProfilePage {

WebDriver driver;
	
	@FindBy(how = How.NAME, using="xhpc_message_text")
	WebElement postInput;
	
	@FindBy(how = How.CSS, using="button.contains('Post')")
	WebElement postButton;
	
	public FacebookProfilePage(WebDriver selenium) {
		driver = selenium;
	}
		
	public FacebookProfilePage writePost(String postContent) {
		postInput.sendKeys(postContent);
		return this;
	}
	
	public FacebookProfilePage clickPost() {
		postButton.click();
		return this;
	}
	
	public FacebookProfilePage postIt(String postContent) {
		this.writePost(postContent).clickPost();
		return this;
	}
}
