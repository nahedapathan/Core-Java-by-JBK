package exceptionhandling.jbkpractise;

public class Test08 {

	static int sum(int num1,int num2)
	{
		if(num1==0)
		{
			throw new ArithmeticException("First Parameter is not valid");
		}
		else
		{
			System.out.println("Both parameter is incorrect");
			return num1+num2;
		}
	}
	public static void main(String[] args) {
		int res=sum(0,12);
		System.out.println(res);
		System.out.println("Continue next Statement");
	}
}
