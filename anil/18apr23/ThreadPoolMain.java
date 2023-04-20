package com.threadPool;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ExecutorService service = Executors.newFixedThreadPool(5);
		while (true) {
			System.out.println("Enter the string: ");
			String message = scanner.nextLine();
			if (message.equalsIgnoreCase("stop") || message.equalsIgnoreCase("exit"))
				break;
			ThreadPool pool = new ThreadPool(message);
			service.execute(pool);

		}
		service.shutdown();
		scanner.close();
	}
}
