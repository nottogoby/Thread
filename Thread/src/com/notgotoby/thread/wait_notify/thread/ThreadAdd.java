package com.notgotoby.thread.wait_notify.thread;

import com.notgotoby.thread.wait_notify.entity.Add;

public class ThreadAdd extends Thread{
	
	private Add a;
	
	public ThreadAdd(Add add, String threadName) {
		// TODO Auto-generated constructor stub
		this.a = add;
		this.setName(threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		a.add();
	}

}
