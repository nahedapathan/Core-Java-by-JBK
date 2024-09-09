package com.tka.staticEx;

public class A {

	int id;
	String name;
	static int rol;
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Good");
	}
	static
	{
		System.out.println("Hello"+rol);
	}
	{
		System.out.println("Why");
	}
	public static void m()
	{
		System.out.println("Bye Bye"+rol);
	}
}
