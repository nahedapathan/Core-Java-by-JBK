package Test;
/*
 * 5.Write a program to print the Fibonacci series up to N terms.
 */
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<num;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
