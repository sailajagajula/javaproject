package Sunray.com;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("In runnable thread");
		Threads.display("Runnable");
	}

}
