package exceptionhandling.jbkpractise;

public class Test07 {
	
	static void employeeAge(int age)throws MyOwnException
	{
		if(age<0)
		{
			throw new MyOwnException("Age Cant be less than Zero");
		}
		else
		{
			System.out.println("valid is Input");
		}
	}
	
	public static void main(String[] args) {
		try {
			employeeAge(-2);
		}
		catch(MyOwnException e)
		{
			e.printStackTrace();
		}
	}

}
