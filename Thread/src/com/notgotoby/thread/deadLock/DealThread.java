package com.notgotoby.thread.deadLock;

/**
 * 线程死锁：不同的线程都在等待不可能释放的锁，从而导致所有的任务都无法继续完成。
 * @author notogoby
 *
 */
public class DealThread implements Runnable{
	
	public String username;
	
	public Object lock1 = new Object();
	public Object lock2 = new Object();
	
	public void serFlag(String username){
		this.username = username;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if("a".equals(username)){
			synchronized (lock1) {
				try {
					System.out.println("username:"+username);
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("按照lock1->lock2代码顺序执行了");
				}
			}
		}
		if("b".equals(username)){
			synchronized (lock2) {
				try {
					System.out.println("username:"+username);
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("按照lock2->lock1代码顺序执行了");
				}
			}
		}
	}
	
}
