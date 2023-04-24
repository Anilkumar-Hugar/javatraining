package com.work;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.Java.Practice.ProducerThread;

public class ProducerConsumerReadWriteLocksMain {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<>();
	    int maxSize = 10;
		ProducerReadWriteLocks producer = new ProducerReadWriteLocks(maxSize,queue);
		Thread producerThread = new Thread(producer);
		ConsumerReadWriteLocks consumer = new ConsumerReadWriteLocks(maxSize,queue);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}

}
