package com.tka.patterns;

public class PPP20 {
	
	/*
	 * 86546
	 * 6
	 * 46
	 * 546
	 * 6546
	 * 86546
	 */
	
	public static void main(String[] args) {
		for(int i=86546,j=10;i%j>0;j=j*10)
		{
			int no=i%j;
			System.out.println(no);
			if(no==i)
			{
				break;
			}
		}
	}

}
