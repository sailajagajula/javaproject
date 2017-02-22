package Sunray.com;

public class Threads {

	public static void display(String s) {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("Before wait: in " + s);
				Thread.sleep(300);
				System.out.println("After wait: in " + s);
			} catch (Exception e) {
				System.out.println("e " + e);
			}
		}
	}

}
