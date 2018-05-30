package com.notgotoby.thread.p_cs.entity;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked","rawtypes"})
public class MyStack {
	
	private List list = new ArrayList();
	
	public synchronized void push(){
		try {
			while(list.size() == 1){
				this.wait();
			}
			list.add("angString="+Math.random());
			this.notifyAll();
			System.out.println("push="+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized String pop(){
		String returnStr = "";
		try {
			while(list.size() == 0){
				System.out.println("pop操作中的："+Thread.currentThread().getName()+"为等待状态");
				this.wait();
			}
			returnStr =  (String) list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop="+list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnStr;
	}
}
