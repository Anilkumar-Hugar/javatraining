package com.Java.Practice;

public class ThreadPoolExecuters implements Runnable {
	String job;	
	public ThreadPoolExecuters(String str) {
		this.job= str;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Start " + job);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(Thread.currentThread().getName()+"End ");
	}


}
