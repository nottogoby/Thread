package com.notgotoby.thread.p_cs;

import com.notgotoby.thread.p_cs.Thead.ThreadConsume;
import com.notgotoby.thread.p_cs.Thead.ThreadProduce;
import com.notgotoby.thread.p_cs.entity.Consume;
import com.notgotoby.thread.p_cs.entity.Produce;
import com.notgotoby.thread.p_cs.entity.MyStack;

/**
 * 一对多，单一生产者，多个消费者
 * @author notogoby
 *
 */
public class Run {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		Produce produce = new Produce(stack);
		Consume consume = new Consume(stack);
		ThreadProduce t1 = new ThreadProduce(produce);
		ThreadConsume t2 = new ThreadConsume(consume);
		t1.start();
		t2.start();
	}

}
