package com.sparity.threads;

public class SimpleThreadDemoEx extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("SPARITy " + i);
		}
	}

	public static void main(String[] args) {
			SimpleThreadDemoEx s=new SimpleThreadDemoEx();
			SimpleThreadDemoEx s1=new SimpleThreadDemoEx();
			SimpleThreadDemoEx s2=new SimpleThreadDemoEx();
			SimpleThreadDemoEx s3=new SimpleThreadDemoEx();
			
			s.start();
			s1.start();
			s2.start();
			s3.start();
			
	}
}
