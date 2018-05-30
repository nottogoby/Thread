package com.notgotoby.lock.reentrantLock.fair_noFairLock;

public class RunNotFair {
	
	public static void main(String[] args) {
		Service service = new Service(false);
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("线程："+Thread.currentThread().getName()+"运行了");
				service.serviceMethod();
			}
		};
		Thread[] threads = new Thread[10];
		for(int i=0;i<10;i++){
			threads[i] = new Thread(run);
		}
		for(int i=0;i<10;i++){
			threads[i].start();
		}
	}

}
