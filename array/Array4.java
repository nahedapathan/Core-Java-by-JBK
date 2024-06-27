package com.tka.array;
/*
 * Create an integer array of size 5
 * add all the elements of the array which are less than 0
 * input: 67 -34 123 -23 -2
 * output: (-34) +(-23) +(-2)=-59
 */
public class Array4 {
	
	public static void main(String[] args) {
		int arr[]= {67,-34,123,-23,-2};
		int sum=0;
		for(int i=0 ;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				sum+=arr[i];
			}
		}
	   System.out.println(sum);
	}
	
	

}
