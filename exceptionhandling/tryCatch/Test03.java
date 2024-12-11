package exceptionhandling.tryCatch;

public class Test03 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4/0);
		}catch(ArithmeticException e)
		{
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
		}
		System.out.println(9);
	}
}
