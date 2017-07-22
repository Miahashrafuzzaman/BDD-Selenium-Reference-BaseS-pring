package com.shiftedtech.heatclinic.steps;

import com.shiftedtech.heatclinic.pages.HomePage;
import com.shiftedtech.heatclinic.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ShiftTeacher on 7/22/2017.
 */
public class StepBase {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected HomePage homePage;

    @Autowired
    protected LoginPage loginPage;


}
