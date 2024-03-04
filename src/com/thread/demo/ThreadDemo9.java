package com.thread.demo;

class ThreadExecutionPriorityCheck extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("CHILD THREAD ");
		}
	}

}

public class ThreadDemo9 {

	public static void main(String[] args) {

		//the priority range is 1-10
		//MAX_PRIORITY IS 10 
		//MIN PRIORITY IS 1
		// here the priority have main and child thread have same,
		// but you will get mixed outpot or according ThreadScheduler
		// for ex : First Come First serve , Round Robin etc;

		ThreadExecutionPriorityCheck td = new ThreadExecutionPriorityCheck();
		td.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD ");
		}
	}
}
