package exceptionhandling.jbkpractise;

public class Test01 {

    public static void main(String[] args) {
		int num1,num2;
		try
		{
			num1=0;
			num2=62/0;
			System.out.println("Try Block Message ");
		}catch(ArithmeticException e)
		{
			System.out.println("Error :Dont Divide by Zero");
		}
		System.out.println("I m Try-catch block");
	}
}
