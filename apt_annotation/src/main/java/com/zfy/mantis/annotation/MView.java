package com.zfy.mantis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * CreateAt : 2019/1/10
 * Describe :
 *
 * @author chendong
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface MView {
    int value();
}
