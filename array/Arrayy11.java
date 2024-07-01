package com.tka.array;

/*
 * Print the content of the array in the reverse order
 */

public class Arrayy11 {
	public static void main(String[] args) {
		int arr[]= {54,65,78,98,756,45,3};
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
