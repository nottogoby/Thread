package com.notgotoby.thread.lock;

/**
 * �������������ڸ�����̳й�ϵʱ���������ͨ�����������������ø����ͬ������
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
