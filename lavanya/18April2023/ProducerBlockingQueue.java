package com.Java.Practice;

import java.util.concurrent.BlockingQueue;
class QueueValue {
	private String value;

	public QueueValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
public class ProducerBlockingQueue implements Runnable {

	BlockingQueue<QueueValue> bQueue;
 
	public ProducerBlockingQueue(BlockingQueue<QueueValue> q) {
		this.bQueue= q;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			QueueValue val = new QueueValue(" " + i);
			try {
				Thread.sleep(i);
				bQueue.put(val);
				System.out.println("Producer " + val.getValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		QueueValue stopvar = new QueueValue("exit");
		try {
			bQueue.put(stopvar);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
