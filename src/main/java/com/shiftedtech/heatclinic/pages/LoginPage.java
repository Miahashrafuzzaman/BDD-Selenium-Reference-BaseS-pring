package com.shiftedtech.heatclinic.pages;

import com.shiftedtech.heatclinic.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by ShiftTeacher on 7/22/2017.
 */

@PageObject
public class LoginPage {

    @Autowired
    private WebDriver driver;

    @FindBy(name = "j_username")
    private WebElement emailTextbox;
    @FindBy(name = "j_password")
    private WebElement passwordTextbox;
    @FindBy(css = ".login_button.big.red")
    private WebElement loginButton;
    @FindBy(css = ".error>p")
    private WebElement errorMessage;


    public void enterEmailAddress(String email){
        emailTextbox.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordTextbox.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();
    }

    public void login(String user, String password){
        enterEmailAddress(user);
        enterPassword(password);
        clickLogin();
    }


    public void verifyErrorMessage(){
        String text  = errorMessage.getText();
        Assert.assertEquals("The e-mail address and/or password entered do not match our records. Please try again",text);
    }

}
