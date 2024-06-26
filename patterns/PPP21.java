package com.tka.patterns;

public class PPP21 {

	/*
	 * 8654
	 * 4
	 * 5
	 * 6
	 * 8
	 */
	
	public static void main(String[] args) {
		for(int i=8654;i>0;i=i/10)
		{
			int r=i%10;
			System.out.println(r);
		}
	}
}
