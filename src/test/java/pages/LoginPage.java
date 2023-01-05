package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement errorMsg;
	
	
	public void login(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
		
	}

}
