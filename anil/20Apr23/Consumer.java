package com.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Consumer implements Runnable {
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	Producer producer;
	public Consumer(Producer producer) {
		this.producer=producer;
	}
	@Override
	public void run() {
		lock.readLock().lock();
		try {
			for(int i=0;i<=producer.list.size();i++) {
				System.out.println("consumed value: "+producer.list.get(i));
			}
			//System.out.println(producer.list);
		} catch (Exception e) {
			e.getMessage();
		} finally {
			lock.readLock().unlock();
		}
	}
}
