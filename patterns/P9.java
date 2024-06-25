package com.tka.patterns;

//###@@@****
//###@@@****
//###@@@****
//###@@@****
 

public class P9 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j==1 || j==2 || j==3)
				{
					System.out.print("#");
				}
				else if(j==4 || j==5 || j==6)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
