package com.notgotoby.thread.p_c;

import com.notgotoby.thread.p_c.Thead.ThreadConsume;
import com.notgotoby.thread.p_c.Thead.ThreadProduce;
import com.notgotoby.thread.p_c.entity.Consume;
import com.notgotoby.thread.p_c.entity.Produce;

public class Run {
	
	public static void main(String[] args) {
		String lock = new String();
		Produce produce = new Produce(lock);
		Consume consume = new Consume(lock);
		ThreadProduce t1 = new ThreadProduce(produce);
		ThreadConsume t2 = new ThreadConsume(consume);
		t1.start();
		t2.start();
	}

}
