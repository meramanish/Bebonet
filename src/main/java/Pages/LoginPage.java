package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	private String userName = "login";
	private String password = "password";
	private String loginButton = "continue";

	public LoginPage(WebDriver driver){
		this.driver = driver;
	}


	/**
	 * To fill the Username on site
	 */	
	public void setUserName(String uName){

		driver.findElement(By.id(userName)).sendKeys(uName);

	}

	/**
	 * To fill the Password on site
	 */	
	public void setPassword(String pass){

		driver.findElement(By.id(password)).sendKeys(pass);

	}

	/**
	 * To click Login button on site
	 */	
	public void clickLoginBtn() {
		driver.findElement(By.id(loginButton)).click();
	}
	
	/**
	 * To click Login to application site
	 */	
	public void loginToApplication(String uName, String pass){
		setUserName(uName);
		setPassword(pass);
		clickLoginBtn();
		System.out.println("You have logged-in");
	}

}