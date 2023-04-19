package com.Java.Practice;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {

	BlockingQueue<QueueValue> bQueue;
	
	public ConsumerBlockingQueue(BlockingQueue<QueueValue> q) {
		this.bQueue = q;
	}
	 
	@Override
	public void run() {
		try {
			if(bQueue.take().getValue()!= "Exit") {
				Thread.sleep(1000);
				System.out.println("Consumer " + bQueue.take().getValue());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
