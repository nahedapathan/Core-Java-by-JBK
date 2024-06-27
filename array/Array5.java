package com.tka.array;



/*
 * Create an int array of length 9
 * Calculate sum of all the elements which are divisible by 3
 * display the sum
 */

public class Array5 {
	public static void main(String[] args) {
		int arr[] = {21,54,65,89,56,58,23,56,58};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		
		
	}

}
