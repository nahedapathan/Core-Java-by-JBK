package com.tka.array;

public class Arrayy16 {
	
	/*
	 * create an float array of size 7
	 * i)increase the value of each element by 5.5
	 */
	public static void main(String[] args) {
		{
			float arr[]= {2f,33.2f,29.3f,45.5f,6f,97f,8f};
			for(int i=0;i<arr.length;i++)
			{
				arr[i]+=5.5f;
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			System.out.println("========");
			//ii) calculate sum of all the element which are greator than 20
			float sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>20)
				{
					sum+=arr[i];
				}
				
			}
			System.out.println(sum);
			
			System.out.println("===========");
			
			//iii)display sum of element of float array
			//iv)Count the number of element which are in the range of 30 to 50
			float count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>30 && arr[i]<50)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
