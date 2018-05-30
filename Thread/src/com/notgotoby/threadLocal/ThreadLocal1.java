package com.notgotoby.threadLocal;

/**
 * ThreadLocal解决的是变量在不同的线程之间的隔离性，也就是不同的线程拥有自己的值。不同线程的值可以放在一个ThreadLocal管理
 * 第一次get的时候会返回null，可以继承ThreadLocal然后实现其initialValue()即可。
 * @author notogoby
 *
 */
public class ThreadLocal1 {
	public static ThreadLocal<String> t = new ThreadLocal<String>();
	public static void main(String[] args) {
		if(t.get() == null){
			System.out.println("默认为null值");
			t.set("my value");
		}
		System.out.println(t.get());
	}
}
