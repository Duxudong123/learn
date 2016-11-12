package chapter1;

import reference1.MyThread8_2;
import reference1.MyThread8_3;

public class thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread8_2 myThread1 = new MyThread8_2();
		myThread1.start();
		MyThread8_3 myThread2 = new MyThread8_3();
		myThread2.start();

	}

}
