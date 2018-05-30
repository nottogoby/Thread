package com.notgotoby.threadLocal;

/**
 * ThreadLocal������Ǳ����ڲ�ͬ���߳�֮��ĸ����ԣ�Ҳ���ǲ�ͬ���߳�ӵ���Լ���ֵ����ͬ�̵߳�ֵ���Է���һ��ThreadLocal����
 * ��һ��get��ʱ��᷵��null�����Լ̳�ThreadLocalȻ��ʵ����initialValue()���ɡ�
 * @author notogoby
 *
 */
public class ThreadLocal1 {
	public static ThreadLocal<String> t = new ThreadLocal<String>();
	public static void main(String[] args) {
		if(t.get() == null){
			System.out.println("Ĭ��Ϊnullֵ");
			t.set("my value");
		}
		System.out.println(t.get());
	}
}
