package com.notgotoby.thread.p_c.entity;

public class Produce {
	
	private String lock;

	public Produce(String lock) {
		super();
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				if(!"".equals(ValueObject.value)){
					lock.wait();
				}
				String value = System.currentTimeMillis()+"_"+System.nanoTime();
				System.out.println("set --->"+value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
