package com.notgotoby.thread.lock;

public class Parent {
	
	public int i = 10;
	
	synchronized public void operateParentMethod(){
		try {
			i--;
			System.out.println("parent print i="+i);
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
