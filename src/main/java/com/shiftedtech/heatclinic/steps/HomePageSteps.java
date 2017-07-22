package com.shiftedtech.heatclinic.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by ShiftTeacher on 7/22/2017.
 */
public class HomePageSteps extends  StepBase{
    @Given("^As a not validated user$")
    public void as_a_not_validated_user() throws Throwable {
        driver.manage().deleteAllCookies();
    }

    @When("^Browse to the url \"([^\"]*)\"$")
    public void browse_to_the_url(String arg1) throws Throwable {
        driver.navigate().to(arg1);
    }

    @Then("^Heatclinic home page should show$")
    public void heatclinic_home_page_should_show() throws Throwable {
        //String text = driver.getTitle();
        //Thread.sleep(3000);

        //WebElement element  = driver.findElement(By.xpath("(//title)[2]"));
        //String text = element.getAttribute("text");
       // Assert.assertEquals("Broadleaf Demo - Heat Clinic",text);
        homePage.verifyHomePageDisplay();
    }

    @When("^User click login button$")
    public void user_click_login_button() throws Throwable {
       // WebElement element = driver.findElement(By.linkText("Login"));
       // element.click();
        homePage.goToLoginPage();
    }

    @Then("^Welcome message shows \"([^\"]*)\"$")
    public void welcome_message_shows(String arg1) throws Throwable {
        //WebElement element = driver.findElement(By.cssSelector(".my-account"));
       // String text = element.getText();
       // Assert.assertEquals(arg1,text);
        homePage.verifyAccountName(arg1);
    }
}
