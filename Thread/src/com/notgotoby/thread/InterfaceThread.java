package com.notgotoby.thread;

public class InterfaceThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
