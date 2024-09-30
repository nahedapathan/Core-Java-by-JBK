package exceptionhandling.jbkpractise;

public class Test05 {
	
	static void throwMethod() throws NullPointerException
	{
		System.out.println("Inside Throw Method");
		throw new NullPointerException("Demo");
	}
	
	public static void main(String[] args) {
		try {
			throwMethod();
		}catch(NullPointerException e)
		{
			System.out.println("Throw Exception caught "+e);
		}
	}

}
