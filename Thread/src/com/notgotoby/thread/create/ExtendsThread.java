package com.notgotoby.thread.create;

public class ExtendsThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(Thread.currentThread().getName());
	}
}
