package steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseStep{
	
	@Before
	public void before(Scenario sc) {
		
		String name = sc.getName();
		ExtentCucumberAdapter.addTestStepLog(name+" Started...");
		
	}
	
	
	@After
	public void after(Scenario sc) throws IOException {
		
		String name = sc.getName();
		
		if(sc.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "image/png" , name);
			//ExtentCucumberAdapter.addTestStepScreenCaptureFromPath("C:\\Users\\dulkumar\\Pictures\\Screenshots\\Screenshot.png","Scr");
			ExtentCucumberAdapter.addTestStepLog(name+" Failed !");
			
		}
		
		
		ExtentCucumberAdapter.addTestStepLog(name+" Success...");
		
		getDriver().quit();
		
	}

}
