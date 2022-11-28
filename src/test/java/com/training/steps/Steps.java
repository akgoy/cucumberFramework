package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Steps extends BaseTest {
	WebDriver driver;
	PageFactory pageFactory = new PageFactory();
	BasePage page;
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	@Given("User is on loginPage {string}")
	public void user_is_on_login_page(String pageName)  {
		try {
			page = pageFactory.initialize(pageName);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("user enter into textbox {string} {string}")
	public void user_enter_into_textbox(String logicalname, String inputData) {
		page.enterIntoTextbox(logicalname,inputData);
	   
	}
	
	@Then("user click on {string}")
	public void user_click_on(String logicalname) {
		page.clickonButton(logicalname);
		
	  
	}
	@Then("user click on checkbox {string}")
	public void user_click_on_checkbox(String logicalname) {
		page.clickCheckbox(logicalname);
	 
	}
	@Given("user is on homePage {string}")
	public void user_is_on_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user enter into textbox")
	public void user_enter_into_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "png", scenario.getName());
		//driver.close();
		//driver=null;
	}


}
