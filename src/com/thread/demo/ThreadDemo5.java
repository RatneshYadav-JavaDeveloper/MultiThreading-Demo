package com.thread.demo;

public class ThreadDemo5 extends Thread {
	
	public void run()
	{
		System.out.println("CHILD THREAD");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("ROYAL");
		ThreadDemo5 td = new ThreadDemo5();
		System.out.println(td.getName());
		int a = 10/0;
		
		
	}
}
