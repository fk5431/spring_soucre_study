package org.springframework.util.function;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

/**
 * @author: fengk
 * @description: *
 * @create: 2019-07-02 18:29
 **/
public class SingletonSupplierTests {

	@Test
	public void testSupplier(){
		Supplier<SupplierTest> sup = SupplierTest::new;
		System.out.println(sup.get());
		System.out.println(sup.get());
	}

	@Test
	public void testSingletonSupplier(){
		Supplier<SupplierTest> sup = SupplierTest::new;
		SupplierTest supplierTest = new SupplierTest();
		SingletonSupplier<SupplierTest> singletonSupplier = new SingletonSupplier<>(supplierTest, sup);
		Assert.assertEquals(singletonSupplier.get(), singletonSupplier.get());
		Assert.assertEquals(supplierTest, singletonSupplier.get());
	}

	private class SupplierTest{

	}
}
