package com.consume.runnable;

public class RunnableMain {
	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();

	}
}
