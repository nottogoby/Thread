package com.notgotoby.thread.current;

/**
 * ≤‚ ‘œﬂ≥ÃisAlive
 * @author notogoby
 *
 */
public class RunTest {
	
	public static void main(String[] args) {
		CountOperate operate = new CountOperate();
		Thread t = new Thread(operate);
		System.out.println("main begin t is alive="+t.isAlive());
		t.setName("A");
		t.start();
		System.out.println("main end t is alive="+t.isAlive());
	}

}
