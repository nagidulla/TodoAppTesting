package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.BaseStep;

public class AddTodoPage{

	@FindBy(id="goal")
	public WebElement goal;
	
	@FindBy(id="TargetDate")
	public WebElement targetDate;
	
	@FindBy(xpath="//button[text()='Add']")
	public WebElement addBtn;
	
	public AddTodoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addGoal(String goalInp, String dateInp) {
		goal.clear();
		goal.sendKeys(goalInp);
		targetDate.clear();
		targetDate.sendKeys(dateInp);
		addBtn.click();
	}
}
