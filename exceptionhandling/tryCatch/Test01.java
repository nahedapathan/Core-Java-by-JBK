package exceptionhandling.tryCatch;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the FNO :");
			int a=sc.nextInt();
			
			System.out.println("Enter the SNO :");
			int b=sc.nextInt();
			
			int c=a/b;
			System.out.println("Result is :"+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Please do not Enter zero as a Second arguments ");
		}
	}

}
