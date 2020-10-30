package com.library.pages;

import com.library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {

    //username
    @FindBy(id= "inputEmail")
    private WebElement username;

    //password
    @FindBy(id="inputPassword")
    private WebElement password;

    public void login(){
        String usernameValue = ConfigurationReader.getProperty("librarian.username");
        String passwordValue = ConfigurationReader.getProperty("librarian.password");
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

   /* public void login(String user){

        String usernameValue = "";
        String passwordValue = "";
        if(user.equalsIgnoreCase("librarian")){
            usernameValue = ConfigurationReader.getProperty("librarian.username");
            passwordValue = ConfigurationReader.getProperty("librarian.password");
        }else if(user.equalsIgnoreCase("student")){
            usernameValue = ConfigurationReader.getProperty("student.username");
            passwordValue = ConfigurationReader.getProperty("student.password");
        }else{
            throw new RuntimeException("Invalid user, valid users are: librarian, student");
        }

    }
    public void login(String usernameValue , String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
*/
   public  void login(String role){
       String usernameValue = "";
       String passwordValue = "";

       if (role.equalsIgnoreCase("librarian")) {
           usernameValue = ConfigurationReader.getProperty("librarian.username");
           passwordValue = ConfigurationReader.getProperty("librarian.password");
       } else if(role.equalsIgnoreCase("student")) {
           usernameValue = ConfigurationReader.getProperty("student.username");
           passwordValue = ConfigurationReader.getProperty("student.password");
       }

       username.sendKeys(usernameValue);
       password.sendKeys(passwordValue, Keys.ENTER);
   }

}



