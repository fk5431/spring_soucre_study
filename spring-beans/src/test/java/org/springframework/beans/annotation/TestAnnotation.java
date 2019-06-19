package org.springframework.beans.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: fengk
 * @description: *
 * @create: 2019-06-19 14:43
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

	//枚举类型
	enum Status {
		FIXED, NORMAL
	}

	//声明枚举
	Status status() default Status.FIXED;
}
