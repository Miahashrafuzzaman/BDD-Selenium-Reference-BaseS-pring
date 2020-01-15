package com.shiftedtech.heatclinic.pages;

import com.shiftedtech.heatclinic.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Miah Ashrafuzzaman on 7/22/2017.
 */

@PageObject
public class HomePage {

    @Autowired
    private WebDriver driver;

    @FindBy(linkText = "Login")
    private WebElement loginLink;
    @FindBy(css = ".my-account")
    private WebElement myAccount;


    public void goToLoginPage(){
        loginLink.click();
    }

    public void verifyHomePageDisplay(){
        WebElement element  = driver.findElement(By.xpath("(//title)[2]"));
        String text = element.getAttribute("text");
        Assert.assertEquals("Broadleaf Demo - Heat Clinic",text);
    }
    public void verifyAccountName(String account){
        String text = myAccount.getText();
        Assert.assertEquals(account,text);
    }

}
