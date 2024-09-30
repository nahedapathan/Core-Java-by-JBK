package exceptionhandling.jbkpractise;

public class Test03 {
	public static void main(String[] args) {
		try {
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("First Print Statement in try Block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Warning :ArithmeicException ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array :IndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Warning Some other Exception");
		}
		System.out.println("Out of try-catch Block");
	}

}
