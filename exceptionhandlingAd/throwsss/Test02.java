package exceptionhandling.throwsss;

public class Test02 {
	
	static void m1(int x) throws IllegalArgumentException,IllegelStateException
	{
		if(x<=0)
		{
			throw new IllegalArgumentException("Do not pass -ve Number");
		}
		if(x%2!=0)
		{
			throw new IllegalStateException("Do not Odd number ");
		}
		System.out.println("Busineess logic goes here");
	}
	public static void main(String[] args) {
		try {
			m1(10);
		}catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch(IllegelStateException e)
		{
			e.printStackTrace();
		} 
	}

}
