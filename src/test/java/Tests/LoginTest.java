package Tests;

import org.testng.annotations.Test;

import Driver.Driver;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends Driver{

	String userName = "mailtomanish08@gmail.com";
	String password = "c@stle321!";

	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);

	@Test
	public void loginTest(){

		loginPage.loginToApplication(userName, password);

	}

	@Test
	public void logout(){

		homePage.logoutToApplication();
	}

}
