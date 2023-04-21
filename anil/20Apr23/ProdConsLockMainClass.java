package com.lock;

public class ProdConsLockMainClass {
	public static void main(String[] args) throws InterruptedException {
		Producer producer = new Producer();
		Thread thread1 = new Thread(producer);
		Consumer consumer = new Consumer(producer);
		Thread thread2 = new Thread(consumer);
		thread1.start();
		thread1.join();
		thread2.start();
	}
}
