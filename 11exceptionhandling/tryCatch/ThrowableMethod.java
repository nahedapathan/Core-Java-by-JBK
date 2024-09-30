package exceptionhandling.tryCatch;

public class ThrowableMethod {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("---------------------------");
			System.out.println(e.toString());
			System.out.println("---------------------------");
			System.out.println(e.getMessage());
		}
	}

}