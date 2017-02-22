package Sunray.com;

import java.io.FileNotFoundException;

public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, b = 0;
		Integer[] array = new Integer[2];
		try {
			array[3] = a / b;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index OutOfBoundsException " + e);
		} catch (ArithmeticException e) {
			System.out.println("Arthematic Exception " + e);
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		System.out.println("test() will be called");
		try {
			test();
		} catch (Exception e) {
			System.out.println("Exception " + e);
		} finally {
			System.out.println("In finally");
		}

	}

	static public void test() throws FileNotFoundException {
		System.out.println("In test()");
		int c = 5 / 0;
		throw new FileNotFoundException("test");
	}

}
