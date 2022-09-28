package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver Chrome;
	public Login_Page(WebDriver rdriver)
	{
		Chrome=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="email")
	WebElement emailadd;  
	
	@FindBy(id="passwd")
	WebElement Password;
	
	@FindBy(id="SubmitLogin")
	WebElement Login;
	
	public void Enteremail(String Emailadd)
	{
	emailadd.sendKeys(Emailadd);
	}
	public void EnterPassword (String pass)
	{
		Password.sendKeys(pass);
	}
	public void LoginButton()
	{
		Login.click();
	
	} 
	}

