package com.notgotoby.thread.wait_notify.thread;

import com.notgotoby.thread.wait_notify.entity.Subtract;

public class ThreadSubtract extends Thread {
	
	private Subtract s;
	
	public ThreadSubtract(Subtract s, String threadName) {
		// TODO Auto-generated constructor stub
		this.s = s;
		this.setName(threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		s.subtract();
	}

}
