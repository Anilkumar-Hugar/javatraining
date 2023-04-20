package com.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
	BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println("value " + i + " consumed");
			}
		} catch (InterruptedException e) {
			e.getMessage();
		}

	}

	public class ConsumerMain {
		static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

		public static void main(String[] args) {

			new Consumer(queue);

		}

	}

}
