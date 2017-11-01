package com.demo.jee.stereotype;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.inject.Stereotype;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Named
@ViewScoped
@Stereotype
@Target(TYPE)
@Retention(RUNTIME)
public @interface Model {
}
