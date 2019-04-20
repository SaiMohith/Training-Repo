package com.sparity.threads;

public class SleepMethodDemoImp implements Runnable{

	public void run(){
		for(int i=0;i<5;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("SPARITY : "+i);
		}
	}
public static void main(String[] args) {
	SleepMethodDemoImp i=new SleepMethodDemoImp();

	Thread t=new Thread(i);
	Thread t1=new Thread(i);
	Thread t2=new Thread(i);
	Thread t3=new Thread(i);
	
	t.start();
	t1.start();
	t2.start();
	t3.start();
}
}
