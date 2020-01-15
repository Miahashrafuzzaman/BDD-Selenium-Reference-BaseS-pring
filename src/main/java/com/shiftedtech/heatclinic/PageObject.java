package com.shiftedtech.heatclinic;

import org.springframework.stereotype.Component;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
/**
 * Created by Miah Ashrafuzzaman on 7/22/2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface PageObject {}