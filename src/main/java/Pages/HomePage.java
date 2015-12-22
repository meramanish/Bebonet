package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	private String clickUser = "//a[contains(text(),'Manish Gupta')]";
	private String logout = "//a[contains(text(),' Log Out')]";

	public HomePage(WebDriver driver){

		this.driver = driver;

	}
	/**
	 * To click User Icon
	 */	
	public void clickOnUser(){
		
		WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(clickUser))));
		element.click();
	}

	/**
	 * To click Logout button
	 */	
	public void clickLogout(){
		
		WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(logout))));
		element.click();
	}


	/**
	 * To Logout from application site
	 */	

	public void logoutToApplication(){
		clickOnUser();
		clickLogout();
		System.out.println("You have logged-out");
	}
}
