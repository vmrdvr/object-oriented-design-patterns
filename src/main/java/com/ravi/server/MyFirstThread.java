package com.ravi.server;

import java.util.concurrent.ScheduledExecutorService;

class MyFirstThread implements Runnable {
	
	ScheduledExecutorService scheduler;
	int id;
	public MyFirstThread(int id) {
		this.id=id;
	}
	public void run() {

		System.out.println("Thread Running " +id);
	}
	
	synchronized void thread(){
		
		System.out.println("Thread"+id+" no");
		
	}

	static class MyThread {
		public static void main(String[] args) {
			for (int i = 0; i < 10; i++) {
				Thread t = new Thread(new MyFirstThread(i));
				t.start();
			
			}
		}
	}

}
