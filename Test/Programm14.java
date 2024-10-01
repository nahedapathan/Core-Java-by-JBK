package Test;
/*
 * 14.Write a program to pass an array to a method and print the sum of its elements.
 */

import java.util.Scanner;

public class Programm14 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the"+size+" Element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int res=SumOfArray(arr);
		System.out.println("Sum of Element of an Array is :"+res);
	}
	
	public static int SumOfArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

}
