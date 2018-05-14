package com.notgotoby.thread.deadLock;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		DealThread t = new DealThread();
		t.serFlag("a");
		Thread t1 = new Thread(t);
		t1.start();
		Thread.sleep(100);
		t.serFlag("b");
		Thread t2 = new Thread(t);
		t2.start();
	}
}
