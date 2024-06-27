package com.tka.array;

//Sum of given Element in Array

public class Array3 {
 
	public static void main(String[] args) {
		int a[]= {67,23,95,43,76,54,32};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}
}
