package com.notgotoby.thread.p_c.Thead;

import com.notgotoby.thread.p_c.entity.Produce;

public class ThreadProduce extends Thread{
	
	private Produce produce;

	public ThreadProduce(Produce produce) {
		super();
		this.produce = produce;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
			produce.setValue();
		}
	}

}
