package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddTodoPage;
import pages.LoginPage;
import pages.MyTodosPage;
import pages.WelcomePage;

public class BaseStep {
	
	private WebDriver driver;
	public WebDriverWait wait;
	public LoginPage loginPage;
	public WelcomePage welcomePage;
	public MyTodosPage myTodosPage;
	public AddTodoPage addTodoPage;
	public static ThreadLocal<WebDriver> dr  = new ThreadLocal<WebDriver>();
	
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static void setWebDriver(WebDriver driver) {
		dr.set(driver);
		
	}
	
	
	public  void startBrowser(String browser) {
		System.out.println("sadas");
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		setWebDriver(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
		welcomePage = PageFactory.initElements(getDriver(), WelcomePage.class);
		myTodosPage = PageFactory.initElements(getDriver(), MyTodosPage.class);
		addTodoPage = PageFactory.initElements(getDriver(), AddTodoPage.class);
		
	}

}
