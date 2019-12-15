package org.springframework.util.backoff;

import org.junit.Test;

/**
 * @author: fengk
 * @description: *
 * @create: 2019-07-02 18:02
 **/
public class ExponentialBackOffTest {
	@Test
	public void test(){
		ExponentialBackOff exponentialBackOff = new ExponentialBackOff(2000, 1.5);
		exponentialBackOff.setMaxInterval(80000);
		exponentialBackOff.setMaxElapsedTime(8000);
	    BackOffExecution backOffExecution = exponentialBackOff.start();
	    for(int i=0;i<10;i++) {
			System.out.println(backOffExecution.nextBackOff());
		}
		System.out.println(backOffExecution.nextBackOff());
	}
}
