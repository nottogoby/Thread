package com.notgotoby.lock.reentrantLock.useConditionWaitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	public Condition condition = lock.newCondition();
	
	public void await(){
		try {
			lock.lock();
			System.out.println("await 时间为："+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void singal(){
		try {
			lock.lock();
			System.out.println("singal 时间为："+System.currentTimeMillis());
			condition.signal();
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}

}
