package exceptionhandling.throwsss;

public class Validator {
	
	static void validate(int a) throws IllegalArgumentException
	{
		throw new IllegalArgumentException("For Fun");
	}
	
	public static void main(String[] args) {
		
		try {
			validate(5);
			
		}catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

}
