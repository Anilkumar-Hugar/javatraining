package com.lock;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Producer implements Runnable {
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	ArrayList<Integer>list=new ArrayList<>();
	@Override
	public void run() {
		this.produce();
	}

	public void produce() {
		lock.writeLock().lock();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("produced value is: " + i);
				list.add(i);

			}
		} catch (Exception e) {
			e.getMessage();
		} finally {
			lock.writeLock().unlock();
		}
	}
}
