package com.notgotoby.thread.lock;

public class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Child child = new Child();
		child.operateParentMethod();
	}
}
