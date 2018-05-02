package com.notgotoby.junit;

import org.junit.Test;

import com.notgotoby.thread.MyThread;

public class JunitTest {
	
	@Test
	public void testThread(){
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
	}

}
