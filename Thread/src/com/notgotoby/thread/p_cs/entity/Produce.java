package com.notgotoby.thread.p_cs.entity;

public class Produce {
	
	private MyStack stack;

	public Produce(MyStack stack) {
		super();
		this.stack = stack;
	}
	
	public void pushService() {
		while(true){
			stack.push();
		}
	}
	
}
