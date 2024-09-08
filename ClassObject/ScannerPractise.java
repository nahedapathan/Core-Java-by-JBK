package com.tka.ClassObject;

import java.util.Scanner;

public class ScannerPractise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer value :");
		int num1=sc.nextInt();
		
		System.out.println("Enter an float value :");
		float num2=sc.nextFloat();
		
		System.out.println("Enter a boolean value :");
		boolean flag=sc.nextBoolean();
		
		System.out.println("Enter an String value");
		String name=sc.next();
		
		System.out.println("Integer :"+num1);
		System.out.println("Float :"+num2);
		System.out.println("Boolean :"+flag);
		System.out.println("String :"+name);
		
		
		
		
	}
}
