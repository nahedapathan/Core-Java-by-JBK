package exceptionhandling.throwsss;

public class Test01 {
	
	static void validate(int a) throws IllegalArgumentException
	{
		if(a<0)
		{
			throw new IllegalArgumentException("Do not pass negative number");
		}
		if(a==0)
		{
			throw new ArithmeticException("Do not Pass Zero");
		}
	    if(a<20)
	    {
	    	throw new IllegalStateException("Pass Value less than 20");
	    }
	    System.out.println("Valid Number");
	}
	public static void main(String[] args)
	{
		try {
			validate(5);
		}catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}
	

}
