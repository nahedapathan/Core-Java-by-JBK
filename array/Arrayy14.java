package com.tka.array;

/*
 * convert all the odd element in array to even element
 * input: 5,7,8,11,98
 * output:6 8 8 12 98
 */

public class Arrayy14 {
	
	public static void main(String[] args) {
		int arr[]= {5,7,8,11,98};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				arr[i]+=1;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
