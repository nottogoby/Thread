package com.notgotoby.thread.resume_suspend;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			t.sleep(5000);
			//A
			t.suspend();
			System.out.println("A=:"+System.currentTimeMillis()+"  i=:"+t.getI());
			t.sleep(5000);
			System.out.println("A=:"+System.currentTimeMillis()+"  i=:"+t.getI());
			//B
			t.resume();
			t.sleep(5000);
			//C
			t.suspend();
			System.out.println("B=:"+System.currentTimeMillis()+"  i=:"+t.getI());
			t.sleep(5000);
			System.out.println("B=:"+System.currentTimeMillis()+"  i=:"+t.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
