package cucumber_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	public WebDriver driver;
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement inputTest;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement password;
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement loginbutton;
	
	public  Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public  void username(String user) {
		inputTest.clear();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(inputTest)).sendKeys(user);;
		
		
		
		
	}
	public void password(String pwd) {
		password.clear();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);;
	}
	public void loginbutton() {
		loginbutton.click();
	}

}
