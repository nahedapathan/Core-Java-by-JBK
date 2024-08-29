package com.tka.inheritance;

public class MyMainClass {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.num1);
		System.out.println(b.num2);
		System.out.println(b.n);
		b.show();
		b.add(2, 3);
		
	}
}
