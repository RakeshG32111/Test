package org.step;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass{


	@Given("User is on Facebook login page")
	public void user_is_on_facebook_login_page() throws Exception {
		urlLaunch("https://www.facebook.com/");
	}
	
	@When("User enter valid Username and Password")
	public void user_enter_valid_username_and_password() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Rakesh");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Rakesh@123");
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("login")).click();

	}
	@Then("User should be going to home page and validate the Username")
	public void user_should_be_going_to_search_hotel_page_and_validate_the_username() {
		System.out.println("valid Credentials");
	}

}
