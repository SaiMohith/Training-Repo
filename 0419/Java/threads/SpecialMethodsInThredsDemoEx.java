package com.sparity.threads;

public class SpecialMethodsInThredsDemoEx extends Thread{
	
	public void run(){
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("HELLO "+i);
		}
	}
public static void main(String[] args) throws InterruptedException {
	SpecialMethodsInThredsDemoEx s=new SpecialMethodsInThredsDemoEx();
	SpecialMethodsInThredsDemoEx s1=new SpecialMethodsInThredsDemoEx();
	SpecialMethodsInThredsDemoEx s2=new SpecialMethodsInThredsDemoEx();
	SpecialMethodsInThredsDemoEx s3=new SpecialMethodsInThredsDemoEx();
	
	s.start();
	try {
		s.join();//Join method takes the Responsibility to execute a pirticular thread Continuous to comple the pirticular task
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
	s1.start();
	s2.start();
	s3.start();
	
}
}
