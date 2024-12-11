package exceptionhandling.tryCatch;

public class Test04 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			try {
				System.out.println(2);
				System.out.println(3);
				System.out.println(4/0);
			}catch(ArithmeticException e)
			{
				System.out.println(5);
				System.out.println(6/0);
				System.out.println(7);
			}
			System.out.println(9);
		}catch(ArithmeticException e)
		{
			System.out.println(51);
			System.out.println(61);
			System.out.println(71);
		}
		System.out.println(91);
	}

}
