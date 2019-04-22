package com.sparity.threads;

public class SleepMethodDemoEx extends Thread{

public void run(){
	for(int i=0;i<=51;i++){
		/*try {
			Thread.sleep(500);  //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
			   					//sleep()-------------------->MultiProgramilg
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("SPARITY : "+i+" "+currentThread().getName()); 
	}
}
public static void main(String[] args) {
	SleepMethodDemoEx s=new SleepMethodDemoEx();
	SleepMethodDemoEx s1=new SleepMethodDemoEx();
	SleepMethodDemoEx s2=new SleepMethodDemoEx();
	SleepMethodDemoEx s3=new SleepMethodDemoEx();
	SleepMethodDemoEx s4=new SleepMethodDemoEx();
	
	s.start();
	s1.start();
	s2.start();
	s3.start();
	s4.start();
}
}
