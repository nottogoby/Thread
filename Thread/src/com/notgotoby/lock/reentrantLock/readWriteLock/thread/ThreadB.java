package com.notgotoby.lock.reentrantLock.readWriteLock.thread;

import com.notgotoby.lock.reentrantLock.readWriteLock.Service;

public class ThreadB extends Thread {
	
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.read();
	}
	
}
