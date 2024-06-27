package com.tka.array;

/*
 * find sum of all the even numbers in an given array
 */
public class Array6 {

	public static void main(String[] args) {
		int arr[]= {14,15,6,9,8};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		
	}
}
