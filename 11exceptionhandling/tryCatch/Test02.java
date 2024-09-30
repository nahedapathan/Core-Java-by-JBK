package exceptionhandling.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a;
		while(true)
		{
			try {
				System.out.println("Enter the FNO :");
				a=sc.nextInt();
				break;
				
			}catch(InputMismatchException e)
			{
				System.err.println("Please only Enter Integer\n");
				
			}
		}
		while(true)
		{
			try {
				System.out.println("Enter the SNO :");
				int b=sc.nextInt();
				
				int c=a/b;
				System.out.println("Result is :"+a/b);
			}catch(InputMismatchException e)
			{
			   System.err.println("Please enter only integer ");
			}
			catch(ArithmeticException e)
			{
				System.err.println("Please do not enter zero as a second Argument ");
			}
			
		}
	}
}
