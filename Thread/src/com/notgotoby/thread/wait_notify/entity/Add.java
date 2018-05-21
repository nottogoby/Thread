package com.notgotoby.thread.wait_notify.entity;

public class Add {
	private String lock;
	public Add(String lock) {
		this.lock = lock;	
	}
	
	public void add(){
		synchronized (lock) {
			ValueObject.list.add("anything");
			lock.notify();
		}
	}
}
