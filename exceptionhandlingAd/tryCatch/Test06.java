package exceptionhandling.tryCatch;

public class Test06 {
	static int m1()
	{
		System.out.println("Before Try Catch :");
		int i=1;
		while(i++<=5)
		{
			try {
				System.out.println("In try ");
				continue;
			}
			catch(ArithmeticException e)
			{
				System.out.println("In Catch");
			}
			finally {
				System.out.println("In Finally");
			}
			System.out.println("After try Catch ");
		}
		return 20;
	}
	
	public static void main(String[] args) {
		
		System.out.println("MAinStart");
		System.out.println(m1());
		
	}

}
