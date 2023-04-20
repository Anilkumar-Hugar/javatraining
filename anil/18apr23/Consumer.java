package com.consume.runnable;

public class Consumer implements Runnable{

	@Override
	public void run() {
		try {
			this.print();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	public synchronized void print() {
		for(int i=1;i<=5;i++) {
			System.out.println("Consumed value is: "+i);
		}
	}

}
