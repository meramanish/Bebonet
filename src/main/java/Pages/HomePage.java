package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		driver.findElement(By.xpath(clickUser)).click();
	}

	/**
	 * To click Logout button
	 */	
	public void clickLogout(){
		driver.findElement(By.xpath(logout)).click();
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
