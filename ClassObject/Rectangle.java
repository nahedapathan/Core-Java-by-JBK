package com.tka.ClassObject;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		double area=length*breadth;
		double perimeter=2*(length+breadth);
		System.out.println(area);
		System.out.println(perimeter);
	}
}
