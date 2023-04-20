package com.consume.runnable;

public class Producer implements Runnable {

	@Override
	public void run() {
		try {
			this.print();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public synchronized void print() {
		int i = 1;
		while (i <= 5) {
			System.out.println("produced value is: " + i);
			i++;
			
		}

	}

}
