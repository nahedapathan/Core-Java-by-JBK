package com.tka.array;

/*
 * Sorting in an array Ascending order
 */
public class Arrayy17 {

	public static void main(String[] args) {
		
		int arr[]= {45,2,12,8,98,145,32,1,56};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
