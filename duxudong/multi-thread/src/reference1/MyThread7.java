package reference1;

public class MyThread7 extends Thread {
	private int count = 5;

	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("calcuate by " + Thread.currentThread().getName() + " count = " + count);
	}

}
