package steps;

import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginSteps extends BaseStep{
	
	
	
	
	
	@Given("I am in {string} browser and navigated to root or Login page")
	public void i_am_in_browser_and_navigated_to_root_or_login_page(String string) {
		
	    // Write code here that turns the phrase above into concrete actions
		startBrowser(string);
		getDriver().navigate().to("http://localhost:8081");
		ExtentCucumberAdapter.addTestStepLog("Navigated to WebApp");
		

	}

	@When("I Enter {string} and {string}")
	public void i_enter_and(String string, String string2){
	    // Write code here that turns the phrase above into concrete actions
		loginPage.login(string, string2);

		
	    
	}

	@Then("I should Redirect to Welcome Page with {string}")
	public void i_should_redirect_to_welcome_page_with(String string)  {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(welcomePage.getWelcomeName().contains(String.format("Welcome %s", string)));
	}
	
	@Then("I should get error")
	public void i_should_get_error() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(loginPage.errorMsg.isDisplayed());
	}
	
	

}
