package com.notgotoby.lock.reentrantLock.useConditionWaitNotify;

/**
 * 使用lock完成线程等待/通知
 * @author notogoby
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		ThreadA a = new ThreadA(myService);
		a.start();
		Thread.sleep(3000);
		myService.singal();
	}
}
