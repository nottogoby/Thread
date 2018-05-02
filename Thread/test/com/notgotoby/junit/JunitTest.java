package com.notgotoby.junit;

import org.junit.Test;

import com.notgotoby.thread.ExtendsThread;
import com.notgotoby.thread.InterfaceThread;

public class JunitTest {
	
	@Test
	public void testInterfaceThread(){
		InterfaceThread myThread = new InterfaceThread();
		Thread thread = new Thread(myThread ,"interface thread");
		thread.start();
	}
	
	@Test
	public void testExtendsThread(){
		ExtendsThread extendsThread = new ExtendsThread();
		extendsThread.setName("extends thread");
		extendsThread.start();
	}
}
