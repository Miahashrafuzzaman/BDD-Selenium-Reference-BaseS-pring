package com.shiftedtech.heatclinic.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by Miah Ashrafuzzaman on 7/22/2017.
 */
public class BeforeAfterHook extends  StepBase{
    @Before
    public void before(){
        //ChromeDriverManager.getInstance().setup();
        //driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void after(){
        //DriverFactory.getInstance().removeDriver();
        //driver.close();
        //driver.quit();
        //driver = null;
    }

}
