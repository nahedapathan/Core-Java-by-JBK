package exceptionhandling.tryCatch;

public class Test05 {
	static int m1()
	{
		System.out.println("Before try/Catch");
		try
		{
			System.out.println("In try");
			return 10;
		}catch(ArithmeticException e)
		{
			System.out.println("In Catch");
		}
		finally
		{
			System.out.println("In Finally");
		}
		System.out.println("After try /Catch");
		return 20;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Start ");
		System.out.println(m1());
		System.out.println("main end");
		m1();
		System.out.println(m1());
	}

}
