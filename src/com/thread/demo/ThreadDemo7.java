package com.thread.demo;

 class ThreadExecution extends Thread {

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("CHILD THREAD");
		}
	}

	
}

public class ThreadDemo7 {
	public static void main(String[] args) {
		System.out.println(" MAIN THREAD PRIORITY : "+Thread.currentThread().getPriority());
		ThreadExecution td7 = new ThreadExecution();
		//if you not set child thread explicitly, it automatically get priority from parent class 
		//which is inherited by ThreadExecution class
		System.out.println("CHILD THRAED PRIORITY : "+td7.getPriority());
	}
}