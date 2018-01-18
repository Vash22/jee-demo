package com.demo.jee.stereotype;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Named
@RequestScoped
@Stereotype
@Target(TYPE)
@Retention(RUNTIME)
public @interface Controller {
}
