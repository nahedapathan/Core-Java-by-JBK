package exceptionhandling.jbkpractise;

public class Test10 {

	public static void main(String[] args) {
		int array[]= {10,20,30};
		int num1=15,num2=0;
		int sum=0;
		try {
			sum=num1+num2;
			System.out.println("This result is :"+sum);
			for(int i=0;i<10;i++)
			{
				System.out.println("The Value of the Array are "+array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error 1:"+e);
		}catch(ArithmeticException e)
		{
			System.out.println("Error 2 :"+e);
		}
	}
}
