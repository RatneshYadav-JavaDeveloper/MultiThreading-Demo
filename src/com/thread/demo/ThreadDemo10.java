package com.thread.demo;

class CheckThreadPriorityExecution extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("CHILD THREAD");
		}
	}

}

public class ThreadDemo10 {

	public static void main(String[] args) {

		CheckThreadPriorityExecution tf = new CheckThreadPriorityExecution();
		tf.setPriority(6);
		tf.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD");
		}
	}
}
