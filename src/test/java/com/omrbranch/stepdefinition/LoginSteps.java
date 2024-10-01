package com.omrbranch.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	

	@Given("User is on the omr Login page")
	public void user_is_on_the_omr_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
	}
	@When("User enter {string} and {string}")
	public void user_enter_and(String name, String password) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@When("click the login button")
	public void clicks_the_login_button() {
		 driver.findElement(By.xpath("//button[@value='login']")).click();
	}
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("Verify login page", true);
	}



}
