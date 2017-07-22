package com.shiftedtech.heatclinic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by ShiftTeacher on 7/22/2017.
 */
@Service
public class PageObjectBeanPostProcessor  implements BeanPostProcessor {

    @Autowired
    private ApplicationContext appContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(PageObject.class)) {
            WebDriver driver = (WebDriver) appContext.getBean(WebDriver.class);
            PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), bean);
        }
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //logger.debug("Bean ''" + beanName + "'' created : " + bean.toString());
        return bean;
    }
}
