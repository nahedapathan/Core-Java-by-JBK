package com.tka.patterns;


//######
//######
//$$$$@@
//$$$$@@
//$$$$@@
public class PP12 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if((i==3 || i==4 || i==5)&&(j==1 || j==2 || j==3 ||j==4))
				{
					System.out.print("$");
				}
				else if((i==3 || i==4 || i==5)&&(j==5 || j==6))
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}

	}

}
