package Test;
/*
 * 11.Write a program to find the sum of elements in an array.
 */
import java.util.Scanner;

public class Programm11 {
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
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of Element in an array :"+sum);
		
	}

}
