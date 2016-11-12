package chapter1;

import reference1.MyThread6;

public class thread6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 thread1 = new MyThread6("A");
		MyThread6 thread2 = new MyThread6("B");
		MyThread6 thread3 = new MyThread6("C");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
