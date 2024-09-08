package com.tka.ClassObject;

import java.util.Scanner;

public class OperationUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}
}
