package com.tka.array;

/*
 * increse the value of each element of an array by 5
 * input: 5 7 8 11 98
 * output: 10 12 13 16 103
 */
public class Arrayy13 {
	
	public static void main(String[] args) {
		int arr[]= {5,7,8,11,98};
		for(int i=0;i<arr.length;i++)
		{
			arr[i]+=5;
			System.out.print(arr[i]+ " ");
		}
	}

}
