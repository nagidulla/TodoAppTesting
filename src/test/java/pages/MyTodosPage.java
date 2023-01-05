package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTodosPage {
	
	@FindBy(xpath="//button[text()='Change Status']")
	public WebElement changeStatusBtn;
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement deleteBtn;
	
	@FindBy(xpath="//button[text()='Update']")
	public WebElement updateBtn;
	
	@FindBy(xpath="//td[3]")
	public WebElement isDone;
	
	@FindBy(xpath="//td[1]")
	public WebElement goal;
	
	@FindBy(xpath="//td[2]")
	public WebElement targetDate;
	
	@FindBy(xpath="//table")
	public WebElement table;
	
	public MyTodosPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void changeStaus() {
		changeStatusBtn.click();
	}
	
	public void delete() {
		deleteBtn.click();
	}
	
	public void update() {
		updateBtn.click();
	}
	
	

}
