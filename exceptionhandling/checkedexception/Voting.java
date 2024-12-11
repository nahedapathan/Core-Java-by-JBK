package exceptionhandling.checkedexception;

public class Voting {
	
	void registration(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		System.out.println("Yor Are Eligible to Vote");
	}

}
