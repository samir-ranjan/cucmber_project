package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_POM.Login_Page;
import io.cucumber.java.en.*;

public class StepDefinatin {
	public WebDriver driver;
	public Login_Page link ;
       
	
	@Given("user lunch the chrome browser")
	public void user_lunch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	  
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	@When("user enter user_id as {string} and password as {string}")
	public void user_enter_user_id_as_and_password_as(String user_id, String password) {
		link=new Login_Page(driver);
		link.username(user_id);
		link.password(password);
				
		
	}

	@When("click on login")
	public void click_on_login() {
		link=new Login_Page(driver);
		link.loginbutton();
	   
	}

	@Then("home page should be {string}")
	public void home_page_should_be(String homepage) {
	   String tittle=driver.getTitle();
	   if(homepage==tittle) {
		   System.out.println("At home page");
	   }
	   else {
		   System.out.println("Fail");
	   }
	   driver.close();
	}

}
