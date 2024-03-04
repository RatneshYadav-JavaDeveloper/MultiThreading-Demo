package com.thread.demo;

class ThreadExecutions extends Thread {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("CHILD THREAD");
		}
	}
}

public class ThreadDemo8 {

	public static void main(String[] args) {
		//set explicitly to main thread, when i print child thread it automatically got priority from main thread
		Thread.currentThread().setPriority(7);
		
		ThreadExecutions te = new ThreadExecutions();
		System.out.println("CHILD THREAD PRIORITY : "+te.getPriority());
		
	}
}
