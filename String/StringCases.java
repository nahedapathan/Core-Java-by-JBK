package com.tka.String;

public class StringCases {

	public static void main(String[] args) {
		String s1=new String("REENA");
		System.out.println(s1);
		
		s1=s1.concat("SHARMA");
		System.out.println(s1);
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}
}
