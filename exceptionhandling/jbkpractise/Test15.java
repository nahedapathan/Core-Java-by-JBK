package exceptionhandling.jbkpractise;

public class Test15 {

	public static void main(String[] args) {
		try
		{
			int num=Integer.parseInt("XYZ");
			System.out.println(num);
		}catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception Occured");
		}
	}
}
