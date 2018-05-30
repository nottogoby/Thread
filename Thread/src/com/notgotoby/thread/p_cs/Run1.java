package com.notgotoby.thread.p_cs;

import com.notgotoby.thread.p_cs.Thead.ThreadConsume;
import com.notgotoby.thread.p_cs.Thead.ThreadProduce;
import com.notgotoby.thread.p_cs.entity.Consume;
import com.notgotoby.thread.p_cs.entity.MyStack;
import com.notgotoby.thread.p_cs.entity.Produce;

/**
 * 一对多，单一生产者，多个消费者
 * @author notogoby
 *
 */
public class Run1 {
	
	public static void main(String[] args) throws InterruptedException {
		MyStack stack = new MyStack();
		Produce produce = new Produce(stack);
		Consume consume1 = new Consume(stack);
		Consume consume2 = new Consume(stack);
		Consume consume3 = new Consume(stack);
		Consume consume4 = new Consume(stack);
		Consume consume5 = new Consume(stack);
		ThreadProduce t = new ThreadProduce(produce);
		ThreadConsume t1 = new ThreadConsume(consume1);
		ThreadConsume t2 = new ThreadConsume(consume2);
		ThreadConsume t3 = new ThreadConsume(consume3);
		ThreadConsume t4 = new ThreadConsume(consume4);
		ThreadConsume t5 = new ThreadConsume(consume5);
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		Thread.sleep(2000);
	}

}
