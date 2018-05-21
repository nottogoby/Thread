package com.notgotoby.thread.wait_notify;

import com.notgotoby.thread.wait_notify.entity.Add;
import com.notgotoby.thread.wait_notify.entity.Subtract;
import com.notgotoby.thread.wait_notify.thread.ThreadAdd;
import com.notgotoby.thread.wait_notify.thread.ThreadSubtract;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);
		ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract,"threadSubtract1");
		ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract,"threadSubtract2");
		threadSubtract1.start();
		threadSubtract2.start();
		Thread.sleep(1000);
		ThreadAdd threadAdd = new ThreadAdd(add, "threadAdd");
		threadAdd.start();
	}

}
