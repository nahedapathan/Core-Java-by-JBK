package com.tka.patterns;

//E D C B A 
//E D C B A 
//E D C B A 
//E D C B A 
//E D C B A 

public class PP16 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			/*for(int j=69;j>=65;j--)
			{
				System.out.print((char)j+" ");
			}*/
			for(char ch='E';ch>='A';ch--)
			{
				System.out.print(ch +" ");
			}
			System.out.println();
		}
	}

}
