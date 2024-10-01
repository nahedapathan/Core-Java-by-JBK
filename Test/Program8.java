package Test;
/*
 * 8.Write a program to find the factorial of a number using recursion.
 */
import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		
		int fact=factorial(num);
		System.out.println("Factorial of "+num+": "+fact);
	}

	public static int factorial(int num) {
		if(num>=1)
		{
			return num*factorial(num-1);
		}
		else
		{
			return 1;
		}
	}

}
