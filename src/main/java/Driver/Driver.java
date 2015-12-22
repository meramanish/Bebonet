package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Driver {

	public WebDriver driver = new FirefoxDriver();

	/**
	 * To Launch the browser with test site
	 */
	@BeforeClass
	public void run(){
		driver.get("https://app.box.com/login");
		driver.manage().window().maximize();
	}

	/**
	 * To delete the History
	 */
	@AfterClass
	public void close() {

		/**
		 * To close the browser
		 */
		driver.quit();

	}

}
