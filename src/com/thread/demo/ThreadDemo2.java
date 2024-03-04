package com.thread.demo;

public class ThreadDemo2 extends Thread {

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("RUN-METHOD CHILD THREAD");
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo2 t2 = new ThreadDemo2();
		//here while calling run() method it treat like as normal method of ThereadDemo2 class
		t2.run();
		
		for(int j=0;j<10;j++)
		{
			System.out.println("MAIN-METHOD MAIN_THREAD");
		}
	}
}
