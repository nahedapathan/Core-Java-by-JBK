package com.tka.methodType2;

public class OperationTest {

	public static void main(String[] args) {
		Addition add=new Addition();
		add.addition(6,5);
		
		Substraction sub=new Substraction();
		sub.substraction(60, 25);
		
		Multiplication mul=new Multiplication();
		mul.multiplication(6, 5);
		
		Division div=new Division();
		div.division(25, 5);
		
		Modulo mod=new Modulo();
		mod.modulo(56, 25);
	}
}
