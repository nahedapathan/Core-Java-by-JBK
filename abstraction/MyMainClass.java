package com.tka.abstraction;

public class MyMainClass {

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		
		DemoImpl d1=new DemoImpl();
		d1.display();
		d1.show();
		d1.method1();
	}
}
