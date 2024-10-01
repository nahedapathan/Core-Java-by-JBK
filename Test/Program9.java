package Test;
/*
 * 9.Write a program to find the largest and smallest elements in an array.
 */
import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the Element "+size+" :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Largest Element is :"+max);
		System.out.println("Smallest Element is :"+min);
		
		
		
	}

}
