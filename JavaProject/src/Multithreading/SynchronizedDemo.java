package Multithreading;

class Myclass implements Runnable {
	private static boolean flag = true;

	public synchronized void printEven() {
		long id = Thread.currentThread().getId();
		for (int i = 2; i < 20; i += 2) {
			System.out.println(i + " id is " + id);

		}

	}

	public synchronized void printOdd() {
		long id = Thread.currentThread().getId();
		for (int i = 1; i < 20; i += 2) {
			System.out.println(i + " id is " + id);

		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag == true) {

			printEven();
		} else {

			printOdd();
		}
	}

}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass myclass = new Myclass();
		Thread eventh1 = new Thread(myclass);
		Thread oddth2 = new Thread(myclass);

		eventh1.start();
		oddth2.start();
	}

}
