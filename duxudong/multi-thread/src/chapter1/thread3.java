package chapter1;

import reference1.MyThread3;

public class thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyThread3 thread = new MyThread3();
			thread.setName("mythread-duxudong");
			thread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
