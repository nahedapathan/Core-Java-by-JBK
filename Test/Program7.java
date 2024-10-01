package Test;

import java.util.Scanner;
/*
 * 7.Write a program to print a multiplication table of a given number using a for loop.
 */

public class Program7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
		
	}

}
