package reference1;

public class MyThread8_2 extends Thread {
	@Override
	public void run() {
		MyThread8_1.dopost("a", "aa");
	}

}
