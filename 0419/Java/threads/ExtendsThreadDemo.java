package com.sparity.threads;
//Thread is a small pice of code which can share multiple applications simultaniously,It will excecute Concurrently
//Two ways to use threads
//-------->class <ClassName> extends Thread
//-------->class <ClassName> implements Runnable
public class ExtendsThreadDemo extends Thread {
	public void run() {//override the run method 
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);//Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
								   //sleep()-------------------->Multi Programilg
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello : " + i);
		}
	}

	public static void main(String[] args) {
		
		ExtendsThreadDemo et = new ExtendsThreadDemo();
		ExtendsThreadDemo et1 = new ExtendsThreadDemo();
		ExtendsThreadDemo et2 = new ExtendsThreadDemo();
		ExtendsThreadDemo et3 = new ExtendsThreadDemo();
		
		//wit the help of et,et1,et2,et3,et4,et5 we can run a task multiple times(threads)
		System.out.println("et.run method(Normal Method) Start");
		et.run();//normal method
		System.out.println("et.run method(Normal Method) Ends");
		System.out.println("et.start(life cycle Method) start");
		et.start();//life cycle method
		//et.start(); Thread Starts Only Once
		try {
			et.join();//special method in Threads 
			//Join method take the responsibility to execute a pirticular thread Continuously to complete that pirticular task.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("et.start(life cycle Method) Ends");
		System.out.println("et1,et2,et3 starts");
		et1.start();
		et2.start();
		et3.start();
		System.out.println("et1,et2,et3 Ends");
	}
}
