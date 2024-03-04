package com.thread.demo;

public class ThreadDemo1 extends Thread {

	public void run()
	{
		//for loop executed by child thread which create the help of start() method
		for(int i=0;i<10;i++)
		{
			System.out.println("RUN-METHOD CHILD THREAD");
		}
		
	}
	
	public static void main(String[] args) {
		//
		ThreadDemo1 td = new ThreadDemo1();
		//start methods available in Thread class and it's habe TS[Thread-Scheduler] which assign to thread execution as ROUND-ROBIN like etc.
		td.start();
		
		//below for loop executed by MAIN-THREAD
		for(int j=0;j<10;j++)
		{
			System.out.println("MAIN-METHOD MAIN THREAD");
		}
	}
}
