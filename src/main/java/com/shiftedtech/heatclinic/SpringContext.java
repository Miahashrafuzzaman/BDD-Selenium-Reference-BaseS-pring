package com.shiftedtech.heatclinic;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Miah Ashrafuzzaman on 7/22/2017.
 */

@Configuration
public class SpringContext {

    @Bean(destroyMethod="quit")
    public WebDriver getDriver() {
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver();
    }
}
