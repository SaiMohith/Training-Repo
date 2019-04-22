package com.sparity.threads;

public class PreDefinedMethodsDemoImp implements Runnable{
	
	public void run(){
		for(int i=0;i<5;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("SPRITY : "+i);
		
	}}
	
	public static void main(String[] args) {
		PreDefinedMethodsDemoImp p=new PreDefinedMethodsDemoImp();
		Thread t=new Thread(p);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t.start();
		t1.start();
		t2.start();
		t.setName("T");
		t1.setName("T1");
		t2.setName("T2");
		
		t.setPriority(10);
		t1.setPriority(5);
		t2.setPriority(1);
		
		System.out.println("Name : "+t.getName()+" "+t1.getName()+" "+t2.getName());
		System.out.println("Priority : "+t.getPriority()+" "+t1.getPriority()+" "+t2.getPriority());
		
		
	}

}
