package selenium2Project.selenium2Project.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookProfilePage {

WebDriver driver;
	
	@FindBy(how = How.NAME, using="xhpc_message")
	WebElement postInput;
	
	@FindBy(how = How.CSS, using="#pagelet_composer button")
	WebElement postButton;
	
	public FacebookProfilePage(WebDriver selenium) {
		driver = selenium;
		driver.findElement(By.cssSelector("a[href*='facebook.com']")).click();
	}
			
	public FacebookProfilePage writePost(String postContent) {
		postInput.click();
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
