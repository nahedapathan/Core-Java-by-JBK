package exceptionhandling.jbkpractise;

public class Test04 {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Inside Block 1");
				int b=45/0;
				System.out.println(b);
			}catch(ArithmeticException e)
			{
				System.out.println("Exception :e1");
			}
			try {
				System.out.println("Inside Block2");
				int b=45/0;
				System.out.println(b);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception :e2");
			}
			System.out.println("Just Other Statement ");
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException ");
			System.out.println("Parent try Catch Block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("IndexOutOfBoundsException ");
			System.out.println("PArent Class");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			System.out.println("Parent");
		}
		System.out.println("Next Statement");
	}

}
