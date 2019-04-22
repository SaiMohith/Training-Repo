package com.sparity.threads;

public class ImplementsRunnableInterfaceDemo implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread());

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello " + i);
		}
	}
public static void main(String[] args) throws InterruptedException {
		
	ImplementsRunnableInterfaceDemo i = new ImplementsRunnableInterfaceDemo();
		
		Thread th = new Thread(i);
		Thread th1 = new Thread(i);
		Thread th2 = new Thread(i);
		Thread th3 = new Thread(i);
		Thread th4 = new Thread(i);
		Thread th5 = new Thread(i);

		th.setName("Th Thread");
		th1.setName("Th1 Thread ");
		th2.setName("Th2 Thread ");
		th3.setName("Th3 Thread ");
		th4.setName("Th4 Thread ");
		th5.setName("Th5 Thread ");

		th.setPriority(1);
		th1.setPriority(10);
		th2.setPriority(10);
		th4.setPriority(1);
		th5.setPriority(1);

		System.out.println(th1.getName() + " " + th2.getName() + " "+ th3.getName() + " " + th.getName() + " " + th5.getName()+ " " + th4.getName());
		System.out.println(th.getId() + " " + th1.getId() + " " + th2.getId()+ " " + th3.getId() + " " + th4.getId() + " " + th5.getId());
		System.out.println(th.getPriority() + " " + th1.getPriority() + " "+ th2.getPriority() + " " + th3.getPriority() + " "+ th4.getPriority() + " " + th5.getPriority());

		th.start();

		//th.join();
		th1.start();
	//	th1.join();
		th2.start();
	//	th2.join();
		th3.start();
	//	th3.join();
		th4.start();
	//	th4.join();
		th5.start();
	}
}
