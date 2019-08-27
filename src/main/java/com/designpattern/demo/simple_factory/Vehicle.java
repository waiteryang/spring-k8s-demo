package com.designpattern.demo.simple_factory;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE )
@Inherited
@Documented
public @interface Vehicle {
    String type () default "";
}
