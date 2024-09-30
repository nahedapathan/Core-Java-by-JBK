package exceptionhandling.jbkpractise;

public class Test09 {
	static void checkEligibility(int stuage,int stuweight)
	{
		if(stuage<12 && stuweight<40)
		{
			throw new ArithmeticException("Student is not Eligible for registration ");
		}
		else
		{
			System.out.println("EntriesValid");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Registration Process !");
		checkEligibility(10,39);
		System.out.println("Have a Nice Day");
	}
}
