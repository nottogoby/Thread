package com.notgotoby.lock.reentrantLock.reentrantLockTest;

public class MyThread extends Thread{
	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myService.testMethod();
	}
}
