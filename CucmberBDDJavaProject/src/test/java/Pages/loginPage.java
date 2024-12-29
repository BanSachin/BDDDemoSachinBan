package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	protected WebDriver driver;

	private By txt_username = By.id("login_field");
	
	private By txt_password = By.id("password");
	
	private By btn_login = By.name("commit");
	
	private By link_portfolio = By.linkText("/bansachin/sachinban.github.io"); 
	
	private By btn_porfile = By.className("Button--invisible Button--medium Button Button--invisible-noVisuals color-bg-transparent p-0");
	
	private By btn_sigout_Profile = By.linkText("Sign out");
	
	private By btn_sigout = By.className("btn btn-sm m-0");
	
	

	
	public loginPage(WebDriver driver) {
	
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			
			throw new IllegalStateException("This is not Login Page. The Current page is "
			+driver.getCurrentUrl());
		}
	}
	
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	
    public void checkPorfolioProjectIsDisplayed() {
		
		driver.findElement(link_portfolio).isDisplayed();
	}

    
    public void openPorfolioProject() {
		
		driver.findElement(link_portfolio).click();
	}
    
    
    public void checkProfileIsDisplayed() {
		
		driver.findElement(btn_porfile).isDisplayed();
	}
    
    
    public void openProfile() {
		
		driver.findElement(btn_porfile).click();
	}
    
    
    public void checkSignOutOnProfileIsDisplayed() {
		
		driver.findElement(btn_sigout_Profile).isDisplayed();
	}
    
        
	public void clickSignOutOnProfile() {
		
		driver.findElement(btn_sigout_Profile).click();
		
	}
	
    public void checkSignOutOnIsDisplayed() {
		
		driver.findElement(btn_sigout).isDisplayed();
	}
	
   public void clickSignOut() {
		
		driver.findElement(btn_sigout).click();
		
	}
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(link_portfolio).click();
		driver.findElement(btn_porfile).click();
		driver.findElement(btn_sigout_Profile).click();
		driver.findElement(btn_sigout).click();
		
		
	}
	
	
	
}
