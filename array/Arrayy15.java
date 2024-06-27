package com.tka.array;

/*
 * create two duplicate array
 * input:a[]={5,7,8,11,98}
 * output:b[]={5,7,8,11,98}
 *        c[]={5,7,8,11,98}
 */
public class Arrayy15 {
	public static void main(String[] args) {
		int a[]= {5,7,8,11,98};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		
		
		
	}

}
