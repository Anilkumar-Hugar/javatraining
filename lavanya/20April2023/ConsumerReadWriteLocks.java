package com.work;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConsumerReadWriteLocks implements Runnable {
	int maxSize;
	Queue<Integer> queue;
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public ConsumerReadWriteLocks(int maxSize, Queue<Integer> queue) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	public void run() {
		lock.readLock().lock();

		try {
			for (int i = 0; i < 10; i++) {
				while (queue.isEmpty()) {
					System.out.println("Queue is empty for Reading");
				}
				int value = queue.poll();
				System.out.println("Consumed: " + value);
				// ((Condition) lock.writeLock()).signal();
			}
		} finally {
			lock.readLock().unlock();
		}

	}
}
