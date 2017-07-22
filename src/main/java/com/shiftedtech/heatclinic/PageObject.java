package com.shiftedtech.heatclinic;

import org.springframework.stereotype.Component;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
/**
 * Created by Iftekhar Ivaan on 6/5/2016.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface PageObject {}