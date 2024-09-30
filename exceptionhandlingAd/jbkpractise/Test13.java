package exceptionhandling.jbkpractise;

public class Test13 {
	
	public static void main(String[] args) {
		try
		{
			throw new CustomExceptionEx("Custom");
		}
		catch(CustomExceptionEx e)
		{
			System.out.println("Hi I am Catch Block");
			System.out.println(e);
		}
	}
}
