package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;

import javax.security.auth.login.Configuration;

public class LoginStepDefinitions {


    LoginPage loginPage =  new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);
    }

    @Then("User should be able to see homepage")
    public void user_should_be_able_to_see_homepage() {
        String expected = "Login - Library";
        String actual = loginPage.getTitle();
        Assert.assertEquals("Test not passed!",expected,actual);
        Driver.closeDriver();

    }




}
