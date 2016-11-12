package reference1;

public class MyThread6 extends Thread {
	private int count = 5;

	public MyThread6(String name) {
		super();
		this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("calcuate by " + Thread.currentThread().getName() + "count = " + count);
		}
	}

}
