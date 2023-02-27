package org.stepdef;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class StepDefinitionClass {
	

	static WebDriver driver;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");}

	@When("User enters User name and Password")
	public void user_enters_User_name_and_Password() {
	
		driver.findElement(By.id("email")).sendKeys("greens");
		driver.findElement(By.name("pass")).sendKeys("password1");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("User is on the home page")
	public void user_is_on_the_home_page() {
		System.out.println("user enters into home page");
	  
	}

}
