package com.tka.String;

public class doubleEqualsMethod {

	public static void main(String[] args) {
		String s1=new String("Meena");
		System.out.println(s1);
		String s2=new String("Meena");
		System.out.println(s2);
		System.out.println(s1==s2);
		
		String s3="Meena";
		System.out.println(s1==s3);
		
		String s4="Meena";
		System.out.println(s4==s3);
	}
}
