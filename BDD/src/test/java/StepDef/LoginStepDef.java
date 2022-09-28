package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Login_Page;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	public WebDriver driver;
	public Login_Page loginpage;

	@Given("user launch crome browse")
	public void user_launch_crome_browse() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		loginpage=new Login_Page(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}


	@When("user enter emial address as {string} and Passowrd as  {string}")
	public void user_enter_emial_address_as_and_passowrd_as(String emiilAdd, String PassWord) {
		loginpage.Enteremail(emiilAdd);
		loginpage.EnterPassword(PassWord);
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
		loginpage.LoginButton();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		String ActualTitle=driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle))
		{
			Assert.assertTrue(false);// Pass
		}
		else {
			Assert.assertTrue(true);// Fail
		}



		driver.close();

	}	
}
