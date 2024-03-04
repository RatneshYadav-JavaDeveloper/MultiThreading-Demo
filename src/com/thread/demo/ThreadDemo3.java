package com.thread.demo;

public class ThreadDemo3 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("RUN METHOD CHILD THREAD");
		}
		
		
	}

	public static void main(String[] args) {
		
		ThreadDemo3 td = new ThreadDemo3();
		
		Thread t = new Thread(td);
		t.start();
	
		for(int j=0;j<10;j++)
		{
			System.out.println("MAIN-METHOD MAIN THREAD");
		}
	}
}
