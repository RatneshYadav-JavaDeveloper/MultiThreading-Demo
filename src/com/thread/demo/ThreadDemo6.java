package com.thread.demo;

public class ThreadDemo6  {

	
	
	public static void main(String[] args) {
		
		//getting main thread priority
		//by default main thread priority is 5
		System.out.println(" MAIN THREAD PRIORITY : "+Thread.currentThread().getPriority());
	}
}
