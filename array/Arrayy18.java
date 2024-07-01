package com.tka.array;

/*
 * sort array in descending array
 */
public class Arrayy18 {

	public static void main(String[] args) {
		int arr[]= {12,54,87,2,3,54,98,568};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j+1])
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
