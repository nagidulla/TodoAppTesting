package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {
	
	@FindBy(css="a[href='list-todos']")
	public WebElement myTodos;

	@FindBy(xpath="//a[@href='add-todo']")
	public WebElement addTodo;
	
	@FindBy(xpath="//a[@href='contact']")
	public WebElement contact;
	
	@FindBy(xpath="//a[@href='welcome']")
	public WebElement welcome;
	
	@FindBy(id="btn3")
	public WebElement addBtn;
	
	@FindBy(id="btn2")
	public WebElement logoutBtn;
	
	@FindBy(xpath="//div[@class='text']/h1")
	public WebElement welcomeText;
	
	public String getWelcomeName() {
		return welcomeText.getText();
	}
	
	public void gotoListTodo() {
		myTodos.click();
	}
	
	public void gotoAddTodo() {
		addTodo.click();
	}
	
	public void gotoContact() {
		contact.click();
	}
	
	public void gotoAddBtn() {
		addBtn.click();
	}
	public void logout() {
		logoutBtn.click();
	}
	
}
