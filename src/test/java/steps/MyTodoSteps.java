package steps;


import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class MyTodoSteps extends BaseStep{
	
	public String  done = "";
	public String goal = "";

	
	
	
	@Given("I am in {string} browser and logged in with credentials {string} and {string}")
	public void i_am_in_browser_and_logged_in_with_credentials_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		startBrowser(string);
		getDriver().navigate().to("http://localhost:8081");
		loginPage.login(string2, string3);
	}

	
	@When("I click on My Todos")
	public void i_click_on_my_todos() {
	    // Write code here that turns the phrase above into concrete actions
	    welcomePage.gotoListTodo();
	}
	

	
	
	@Then("List of Todos should be visible")
	public void list_of_todos_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(myTodosPage.table.isDisplayed());
	}

	@When("I click on Change Status")
	public void i_click_on_change_status()  {
	    // Write code here that turns the phrase above into concrete actions
		done = myTodosPage.isDone.getText();
	    myTodosPage.changeStaus();
	}

	@Then("Todo Done Column should change")
	public void todo_done_column_should_change()   {
	    // Write code here that turns the phrase above into concrete actions
	    String done2 = myTodosPage.isDone.getText();
	
//	    Assert.assertFalse(done.equals(done2));
	}


	@When("I click on update")
	public void i_click_on_update() {
	    // Write code here that turns the phrase above into concrete actions
		goal = myTodosPage.goal.getText();
		myTodosPage.update();
	    
	}

	@Then("it should redirect to add-todo page")
	public void it_should_redirect_to_add_todo_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(getDriver().getTitle(), "ADD TODO");
	}
	
	

	@When("i edit the goal as {string} and {string} and click on add")
	public void i_edit_the_goal_as_and_and_click_on_add(String string, String string2)  {
	    // Write code here that turns the phrase above into concrete actions
		addTodoPage.addGoal(string, string2);
		
	    
	}

	@Then("the i should redirect to my todos page and goal should be edited")
	public void the_i_should_redirect_to_my_todos_page_and_goal_should_be_edited()  {
		
	    String goal2 = myTodosPage.goal.getText();
		// Write code here that turns the phrase above into concrete actions
		//Assert.assertFalse(goal.equals(goal2));
	    Assert.fail();
	    
	}
	
	
	
}