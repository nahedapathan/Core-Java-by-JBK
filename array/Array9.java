package com.tka.array;

/*
 * find the biggest element in a Array
 */

public class Array9 {
	public static void main(String[] args) {
		int arr[]= {25,45,87,98,123,145,6};
		int biggest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>biggest)
			{
				biggest=arr[i];
			}
		}
		System.out.println(biggest);
		
	}

}
