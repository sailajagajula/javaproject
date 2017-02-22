package Sunray.com;

public class ExtendsThread extends Thread {
	@Override
	public void run() {
		System.out.println("In extends thread");
		Threads.display("Extends");
	}
}
