package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	
	@FindBy(name="username") private WebElement user;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(name="//img[contains(src,''timer)]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	
	//Initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	//utilization
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	
	//Generic Reusable Methods
	
	public void validLogin(String validUsername, String validPassword)
	{
		user.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginbtn.click();
	}
	
	public void InvalidLogin(String InvalidUsername, String InvalidPassword) throws InterruptedException
	{
		user.sendKeys(InvalidUsername);
		Thread.sleep(2000);
		psw.sendKeys(InvalidPassword);
		Thread.sleep(2000);
		loginbtn.click();
		Thread.sleep(2000);
		user.clear();
		
		
	}
	
	
	
	
	
	
	
	
	}


