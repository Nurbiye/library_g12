package com.library.pages;

import com.library.utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

import static com.library.utils.BrowserUtil.enterText;

public class BooksPage extends BasePage {
@FindBy(xpath = "//span[.='Books']")
private WebElement booksButton;

@FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
private WebElement addBookBtn;

@FindBy(xpath = "//input[@name='name']")
private WebElement bookNameInputBox;

@FindBy(xpath = "//input[@name='isbn']")
private WebElement bookISBNInputBox;

@FindBy(xpath = "//input[@name='year']")
private WebElement bookYearInputBox;

@FindBy(xpath = "//input[@name='author']")
private WebElement bookAuthorInputBox;

@FindBy(xpath = "//textarea[@name='description']")
private WebElement bookDescriptionInputBox;

@FindBy(xpath = "//button[.='Save changes']")
private WebElement saveChangesBtn;

@FindBy(xpath = "//div[@class='toast-message']")
private WebElement confirmationMessage;

    private Map<String, String> map;

public void clickBooksButton(){
    BrowserUtil.wait(3);
    booksButton.click();
}

public void clickAddBookBtn(){
    BrowserUtil.wait(3);
    addBookBtn.click();
}

public void fillUpBookInfo(Map<String,String> map){

    enterText(bookNameInputBox,map.get("Book Name"));
    enterText(bookISBNInputBox,map.get("ISBN"));
    enterText(bookYearInputBox,map.get("Year"));
    enterText(bookAuthorInputBox,map.get("Author"));
    enterText(bookDescriptionInputBox,map.get("Description"));

}
public void clickSaveChanges(){
        saveChangesBtn.click();
}

public boolean confirmationMessage(){
    BrowserUtil.wait(1);
        return confirmationMessage.isDisplayed();
}



}
