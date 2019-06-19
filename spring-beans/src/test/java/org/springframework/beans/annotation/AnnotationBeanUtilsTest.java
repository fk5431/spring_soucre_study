package org.springframework.beans.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author: fengk
 * @description: *
 * @create: 2019-06-19 14:41
 **/
public class AnnotationBeanUtilsTest {

	@TestAnnotation(status = TestAnnotation.Status.NORMAL)
	public void test(){

	}

	@Test
	public void testAnnotation() throws Exception{
		Class<?> testClass = AnnotationBeanUtilsTest.class;
		Method method = testClass.getMethod("test", null);
		Annotation[] annotations = method.getAnnotations();
		for(Annotation annotation : annotations) {
			Method[] annotationProperties = annotation.annotationType().getDeclaredMethods();
			for(Method methodTmp : annotationProperties) {
				System.out.println();
			}
		}

	}
}
