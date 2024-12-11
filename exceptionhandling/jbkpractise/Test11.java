package exceptionhandling.jbkpractise;

public class Test11 {
	
	public static void intFn() throws OwnException{
		System.out.println("Throwing Own Exception from intFn()");
		throw new OwnException(10);
	}
	
	public static void floatfn() throws OwnException{
		System.out.println("Throwing Own Exception from floatfn()");
		throw new OwnException((float)111.111);
	}

	
	public static void charFn() throws OwnException
	{
		System.out.println("Throwing OwnException from charFn()");
		throw new OwnException('A');
	}
	
	public static void StringFn() throws OwnException
	{
		System.out.println("Throwing OwnException from StrinFn()");
		throw new OwnException("Java World");
	}
	
	public static void main(String[] args) {
		try
		{
			intFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			floatfn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			charFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			StringFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		
	}
}
