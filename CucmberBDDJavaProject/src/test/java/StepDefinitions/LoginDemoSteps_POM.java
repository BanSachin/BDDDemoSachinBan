package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import Pages.loginPage;


public class LoginDemoSteps_POM {
	
	WebDriver driver = null;
	loginPage login;

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
		
		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		System.setProperty("webdriver.Edge.driver", projectPath+"/src/test/resources/drivers/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://github.com/login");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		
		login = new loginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		// driver.findElement(By.id("name")).sendKeys(username);
		// driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickLogin();
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		login.checkPorfolioProjectIsDisplayed();
		//login.checkLogOutIsDisplayed();
		
		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
		
	}
	
	@And ("user clicks on project")
	public void user_clicks_on_project() throws InterruptedException {
		
		login.openPorfolioProject();
		Thread.sleep(2000);
	}
	
    @Then ("user is navigated to project page")
    public void user_is_navigated_to_project_page() throws InterruptedException {
		
    	login.checkProfileIsDisplayed();
    	Thread.sleep(2000);
	}
    
    @And ("user clicks on profile")
    public void user_clicks_on_profile() throws InterruptedException {
		
    	login.openProfile();
    	Thread.sleep(2000);
	}
    
    @Then ("user is to navigated to profile")
        public void user_is_to_navigated_to_profile() throws InterruptedException {
		
    	login.checkSignOutOnProfileIsDisplayed();
    	Thread.sleep(2000);
	}
    
    @And ("user clicks on Signout")
    public void user_clicks_on_Signout() throws InterruptedException {
		
    	login.clickSignOutOnProfile();
    	Thread.sleep(2000);
	}
    
    @Then ("user is on signout page") 
    public void user_is_on_signout_page() throws InterruptedException {
		
    	login.checkSignOutOnIsDisplayed();
    	Thread.sleep(2000);
	}
    
    @And ("user signout from GitHub")
    public void user_signout_from_GitHub() throws InterruptedException {
		
    	login.clickSignOut();
    	Thread.sleep(2000);
	}

	
	
	

}
