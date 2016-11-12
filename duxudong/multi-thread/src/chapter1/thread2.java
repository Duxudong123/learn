package chapter1;

import reference1.MyThread2;

public class thread2 {
	public static void main(String[] args) {
		MyThread2 mythread = new MyThread2();
		mythread.run();
		System.out.println("runing over!");
	}

}
