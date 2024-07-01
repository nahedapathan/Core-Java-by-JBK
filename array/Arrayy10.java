package com.tka.array;
/*
 * find the Smallest element in a Array
 */

public class Arrayy10 {
	public static void main(String[] args) {
		int arr[]= {8,65,58,758,65,2,3};
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}
}
