package com.sparity.threads;

public class PreDefinedMethodsDemoEx extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(/*"  Id : "+currentThread().getId()+*/"  Name : "+currentThread().getName()+"  Priority : "+currentThread().getPriority());
		
	}}
	public static void main(String[] args) {
		PreDefinedMethodsDemoEx p=new PreDefinedMethodsDemoEx();
		PreDefinedMethodsDemoEx p1=new PreDefinedMethodsDemoEx();
		PreDefinedMethodsDemoEx p2=new PreDefinedMethodsDemoEx();
		PreDefinedMethodsDemoEx p3=new PreDefinedMethodsDemoEx();
		PreDefinedMethodsDemoEx p4=new PreDefinedMethodsDemoEx();
		
		Thread t=new Thread("Sparity");
		System.out.println(t.getName());
		p.setName("P");
		p1.setName("P1");
		p2.setName("P2");
		p3.setName("P3");
		p4.setName("P4");
		
		p.setPriority(MAX_PRIORITY);
		p4.setPriority(MIN_PRIORITY);

		p.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
	}
}
