package com.Java.Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;


public class ThreadPoolExecutersMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String>a=new ArrayList<>();	
		for(int i=0;i<5;i++) {
        String s = in.nextLine();
        a.add(s);
		}
        
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5 ; i++) {			
	        Runnable workerThread= new ThreadPoolExecuters("" + a.get(i));
	        executor.execute(workerThread);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			//System.out.println("threadpool undertaking jobs");
		}
		System.out.print("Finished all jobs");
	}

}
