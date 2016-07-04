package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BlankStepDefs{
    public WebDriver driver;
    
    public BlankStepDefs()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.seleniumframework.com");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
     System.out.println("Current URL is" + driver.getCurrentUrl());  
     System.out.println("Current Title is" + driver.getTitle());
     }
    
}