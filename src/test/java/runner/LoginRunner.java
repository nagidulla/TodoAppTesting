package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features="src/test/java/features",
		glue="steps",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:ExtentReports"}
	)
public class LoginRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	
	

}