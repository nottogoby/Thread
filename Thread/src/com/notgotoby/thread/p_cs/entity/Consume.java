package com.notgotoby.thread.p_cs.entity;

public class Consume {
	
	private MyStack stack;

	public Consume(MyStack stack) {
		super();
		this.stack = stack;
	}
	
	public void popService(){
		System.out.println("pop="+stack.pop());
	}

}
