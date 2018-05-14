package com.notgotoby.thread.lock;

/**
 * 重入锁。当存在父子类继承关系时，子类可以通过“可重入锁”调用父类的同步方法
 * @author notogoby
 *
 */
public class Child extends Parent{
	
	synchronized public void operateParentMethod(){
		try {
			while(i > 0){
				i--;
				System.out.println("child print i="+i);
				Thread.sleep(100);
				super.operateParentMethod();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
