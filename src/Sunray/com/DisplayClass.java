package Sunray.com;

public class DisplayClass {
	public static void main(String args[]) {
		// final Table obj = new Table();//only one object

		Thread t1 = new Thread() {
			public void run() {
				display("t1");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				display("t2");
			}
		};

		t1.start();
		t2.start();

		ExtendsThread et = new ExtendsThread();
		ThreadRunnable tr = new ThreadRunnable();
		Thread t = new Thread(tr);
		t.start();
		et.start();

	}

	synchronized public static void display(String s) {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("before wait " + s);
				Thread.sleep(300);
				System.out.println("after wait " + s);
			} catch (Exception e) {
				System.out.println("e " + e);
			}
		}
	}
}
