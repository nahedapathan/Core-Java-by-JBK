package com.tka.array;

/*
 * find sum of all the odd numbers in an given array
 */

public class Array7 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

}
