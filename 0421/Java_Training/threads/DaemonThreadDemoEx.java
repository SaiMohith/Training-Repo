package com.sparity.threads;

public class DaemonThreadDemoEx extends Thread {

	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("isDaemon : " + currentThread().isDaemon());
		System.out.println("Name : " + currentThread().getName());
		System.out.println("isAlive : " + currentThread().isAlive());
		System.out.println("Priority : " + currentThread().getPriority());
	}

	public static void main(String[] args) {

		DaemonThreadDemoEx d = new DaemonThreadDemoEx();
		DaemonThreadDemoEx d1 = new DaemonThreadDemoEx();
		DaemonThreadDemoEx d2 = new DaemonThreadDemoEx();
		DaemonThreadDemoEx d3 = new DaemonThreadDemoEx();

		d.setDaemon(true);
		d.setPriority(10);
		d1.setPriority(9);
		d2.setPriority(8);
		d3.setPriority(7);

		d.start();
		d1.start();
		d2.start();
		d3.start();
	}
}
