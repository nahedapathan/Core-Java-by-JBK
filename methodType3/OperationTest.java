package com.tka.methodType3;

public class OperationTest {

	public static void main(String[] args) {
		Addition add=new Addition();
		int res=add.addition(5, 6);
		System.out.println("Addition is : "+res);
		
		Substraction sub=new Substraction();
		int res2=sub.substraction(25, 7);
		System.out.println("Substraction is :"+res2);
		
		Multiplication mul=new Multiplication();
		int res3=mul.multiplication(6, 6);
		System.out.println("Multiplication is :"+res3);
		
		Division div=new Division();
		int res4=div.division(36, 3);
		System.out.println("Division is :"+res4);
		
		Modulo mod=new Modulo();
		int res5=mod.modulo(78, 9);
		System.out.println("Modulo is :"+res5);
	}
}
