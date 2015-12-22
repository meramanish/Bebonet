package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

		WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(userName))));
		element.sendKeys(uName);

	}

	/**
	 * To fill the Password on site
	 */	
	public void setPassword(String pass){

		WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(password))));
		element.sendKeys(pass);

	}

	/**
	 * To click Login button on site
	 */	
	public void clickLoginBtn() {
		
		WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(loginButton))));
		element.click();
	}

	/**
	 * To Login on application site
	 */	
	public void loginToApplication(String uName, String pass){
		setUserName(uName);
		setPassword(pass);
		clickLoginBtn();
		System.out.println("You have logged-in");
	}

}
