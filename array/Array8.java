package com.tka.array;

/*
 * find sum of all the element which are divisible by 3 & 5
 */

public class Array8 {
	public static void main(String[] args) {
		int arr[]= {2,3,8,15,10};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0 && arr[i]%5==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

}
