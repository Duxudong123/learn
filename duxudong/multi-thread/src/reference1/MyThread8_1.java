package reference1;

public class MyThread8_1 {
	private static String userName;
	private static String passWord;

	synchronized public static void dopost(String username, String password) {
		try {
			userName = username;
			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passWord = password;
			System.out.println("username = " + userName + " password " + passWord);

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
