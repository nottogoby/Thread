package com.notgotoby.thread;

public class ExtendsThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(Thread.currentThread().getName());
	}
}
