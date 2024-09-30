package exceptionhandling.checkedexception;

public class Divisor {

	void division(int dividend,int divisor) throws InvalidDivisorException
	{
		if(divisor==0)
		{
			throw new InvalidDivisorException("Divisor not be Zero");
		}
		else
		{
			System.out.println(dividend/divisor);
		}
	}
}
