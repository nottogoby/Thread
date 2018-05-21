package com.notgotoby.thread.p_c.Thead;

import com.notgotoby.thread.p_c.entity.Consume;

public class ThreadConsume extends Thread {

	private Consume consume;

	public ThreadConsume(Consume consume) {
		super();
		this.consume = consume;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
			consume.getValue();
		}
	}
	
}
