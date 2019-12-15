package org.springframework.core.io;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: fengk
 * @description: *
 * @create: 2019-07-01 16:41
 **/
public class ClassRelativeResourceLoaderTests {

	@Test
	public void getResourceByPath() throws Exception{
		ClassRelativeResourceLoader classRelativeResourceLoader = new ClassRelativeResourceLoader(ClassRelativeResourceLoaderTests.class);
		Resource resource = classRelativeResourceLoader.getResourceByPath("a.txt");
		assertNotNull("classRelativeResourceLoader is null", resource);
	}
}
