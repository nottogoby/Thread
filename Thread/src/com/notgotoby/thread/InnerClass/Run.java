package com.notgotoby.thread.InnerClass;

import com.notgotoby.thread.InnerClass.OuterClass.InnerClass1;
import com.notgotoby.thread.InnerClass.OuterClass.InnerClass2;

/**
 * 同步代码块对静态内部内上锁以后，其他线程只能以同步的方式访问静态内部内中的静态同步方法
 * @author notogoby
 *
 */
public class Run {
	
	public static void main(String[] args) {
		InnerClass1 class1 = new InnerClass1();
		InnerClass2 class2 = new InnerClass2();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				class1.method1(class2);
			}
		},"T1");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				class1.method2();
			}
		},"T2");
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				class2.method1();
			}
		},"T3");
		t1.start();
		t2.start();
		t3.start();
	}

}
