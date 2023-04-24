package com.work;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProducerReadWriteLocks implements Runnable {
	int maxSize;
	Queue<Integer> queue;
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public ProducerReadWriteLocks(int maxSize, Queue<Integer> queue) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	public void run() {
		lock.writeLock().lock();

		try {
			for (int i = 0; i < 10; i++) {
				while (queue.size() == maxSize) {
					System.out.println("Queue is full for writing");
				}
				queue.add(i);
				System.out.println("Produced: " + i);
				// ((Condition) lock.readLock()).signal();
			}
		} 
		finally {
			lock.writeLock().unlock();
		}
	}

}
