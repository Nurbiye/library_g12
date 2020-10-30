package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class AddBookStepDefinition {
    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();

    }
    @Given("user clicks on the Books tab")
    public void user_clicks_on_the_tab() {
        booksPage.clickBooksButton();
    }
    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
        booksPage.clickAddBookBtn();
    }
    @When("user enters book's information")
    public void user_enters_book_s_information(Map<String,String> map) {
        booksPage.fillUpBookInfo(map);
        booksPage.clickSaveChanges();
    }
    @Then("confirmation message appears")
    public void confirmation_message_appears() {
        Assert.assertTrue(booksPage.confirmationMessage());
    }




}
