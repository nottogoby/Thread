package com.notgotoby.lock.reentrantLock.readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReentrantLock之读写锁，表示两个锁，一个是读锁，一个是写锁。其中读与读之间不互斥，读与写之间互斥，
 * 写与写之间互斥。
 * 没有线程获取写锁的时候，进行读取的多个thread可以获取读锁。
 * 而进行写操作的thread只有获取写锁之后才能进行写操作。即多个thread可以同时进行写入操作，
 * 但同一时刻只允许一个thread进行写操作
 * @author notogoby
 *
 */
public class Service {
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			try {
				lock.readLock().lock();;
				System.out.println("ThreadName:"+Thread.currentThread().getName()+"  获得读锁。");
				Thread.sleep(10000);
			} finally {
				// TODO: handle finally clause
				lock.readLock().unlock();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
