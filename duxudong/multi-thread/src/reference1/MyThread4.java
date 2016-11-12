package reference1;

public class MyThread4 extends Thread{
	private int i;
	public MyThread4(int i){
		super();
		this.i = i;
	}
	public void run(){
		System.out.println(i);
	}

}
