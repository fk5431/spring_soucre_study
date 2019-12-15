package org.springframework.util.backoff;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: fengk
 * @description: *
 * @create: 2019-07-02 17:57
 **/
public class FixedBackOffTests {

	@Test
	public void test(){
		FixedBackOff fixedBackOff = new FixedBackOff(2000, 10);
		BackOffExecution backOffExecution = fixedBackOff.start();
		for(int i = 1; i <= 10; i++) {
			//每次重试时间是100毫秒
			System.out.println(backOffExecution.nextBackOff());
		}
		System.out.println(backOffExecution.nextBackOff());
		Assert.assertEquals(BackOffExecution.STOP, backOffExecution.nextBackOff());
	}

}
