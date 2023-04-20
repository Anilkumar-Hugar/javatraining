package com.threadPool;

public class ThreadPool implements Runnable {
	String message;

	public ThreadPool(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " staring thread");
		this.getMsg();
		System.out.println(Thread.currentThread().getName() + " End of thread");
	}

	public void getMsg() {
		try {
			System.out.println("Processing the thread with " + message);
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.getMessage();
		}
	}

}
