package com.notgotoby.thread.shutdown.returnShutdown;

public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		ReturnShutdown thread = new ReturnShutdown();
		thread.start();
		thread.sleep(1000);
		thread.interrupt();
	}

}
