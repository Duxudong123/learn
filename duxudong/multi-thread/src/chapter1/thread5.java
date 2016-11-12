package chapter1;

import reference1.MyThread5;

public class thread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 runnable = new MyThread5();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("running over !");
	}

}
