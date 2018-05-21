package com.notgotoby.thread.p_c.entity;

public class Consume {
	
	private String lock;

	public Consume(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue(){
		try {
			synchronized (lock) {
				if("".equals(ValueObject.value)){
					lock.wait();
				}
				System.out.println("get --->"+ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
