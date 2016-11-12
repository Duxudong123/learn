package chapter1;

import reference1.MyThread7;

public class thread7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread7 myThread = new MyThread7();
		Thread thread1 = new Thread(myThread,"A");
		Thread thread2 = new Thread(myThread,"B");
		Thread thread3 = new Thread(myThread,"C");
		Thread thread4 = new Thread(myThread,"D");
		Thread thread5 = new Thread(myThread,"E");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}

}
