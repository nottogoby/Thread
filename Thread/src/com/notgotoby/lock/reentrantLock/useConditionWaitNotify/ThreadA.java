package com.notgotoby.lock.reentrantLock.useConditionWaitNotify;

public class ThreadA extends Thread {
	
	private MyService myService = new MyService();

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myService.await();
	}
}
