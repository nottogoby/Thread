package com.notgotoby.lock.reentrantLock.readWriteLock;

import com.notgotoby.lock.reentrantLock.readWriteLock.thread.ThreadA;
import com.notgotoby.lock.reentrantLock.readWriteLock.thread.ThreadB;

/**
 * 读与读之间不互斥
 * @author notogoby
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.setName("A");
		b.setName("B");
		a.start();
		b.start();
	}
}
