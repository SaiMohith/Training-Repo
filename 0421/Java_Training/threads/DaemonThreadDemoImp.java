package com.sparity.threads;

public class DaemonThreadDemoImp implements Runnable{
	
	public void run(){
		for (int i=0;i<5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
public static void main(String[] args) throws InterruptedException {
	DaemonThreadDemoImp d=new DaemonThreadDemoImp();
	Thread th=new Thread(d);
	Thread th1=new Thread(d);
	Thread th2=new Thread(d);
	Thread th3=new Thread(d);
	Thread th4=new Thread(d);
	
	th.setDaemon(true);
	th.setName("TH");
	th.setPriority(10);
	
	
	th.start();
	System.out.println("isDaemon : "+th.isDaemon()+" Name : "+th.getName()+"  Priority : "+th.getPriority());
	th.join();
	th1.start();
	System.out.println("isDaemon : "+th1.isDaemon()+" Name : "+th1.getName()+"  Priority : "+th1.getPriority());
	th2.start();
	th3.start();
	th4.start();
}
}
