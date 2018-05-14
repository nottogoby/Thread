package com.notgotoby.thread.shutdown.returnShutdown;

/**
 * @author notogoby
 *
 */
public class ReturnShutdown extends Thread{
	
	@Override
	public void run() {
		while(true){
			if(this.isInterrupted()){
				System.out.println("shutdown....................");
				return;
			}
			System.out.println("time:"+System.currentTimeMillis());
		}
	}

}
