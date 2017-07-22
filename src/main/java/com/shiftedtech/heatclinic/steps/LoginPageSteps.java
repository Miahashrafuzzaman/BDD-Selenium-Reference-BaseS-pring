package com.shiftedtech.heatclinic.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by ShiftTeacher on 7/22/2017.
 */
public class LoginPageSteps extends  StepBase {
    @When("^Enter \"([^\"]*)\" as email address$")
    public void enter_as_email_address(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.name("j_username"));
        element.sendKeys(arg1);
    }

    @When("^Enter \"([^\"]*)\" as password$")
    public void enter_as_password(String arg1) throws Throwable {
        WebElement element = driver.findElement(By.name("j_password"));
        element.sendKeys(arg1);
    }

    @When("^Click login$")
    public void clickLogin() throws Throwable {
        WebElement element = driver.findElement(By.cssSelector(".login_button.big.red"));
        element.click();
    }

    @Then("^Error Message should display$")
    public void verifyInvalidLoginMessage(){
        WebElement element = driver.findElement(By.cssSelector(".error>p"));
        String text  = element.getText();
        Assert.assertEquals("The e-mail address and/or password entered do not match our records. Please try again",text);
    }

    @When("Login with user \"([^\"]*)\" and password \"([^\"]*)\"")
    public void login(String user, String password) throws Throwable {
        enter_as_email_address(user);
        enter_as_password(password);
        clickLogin();
    }

}
