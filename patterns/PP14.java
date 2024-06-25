package com.tka.patterns;

//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 

public class PP14 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			/*for(int j=65;j<=69;j++)
			{
				System.out.print((char)j+" ");
			}*/
			for(char ch='A';ch<='E';ch++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
