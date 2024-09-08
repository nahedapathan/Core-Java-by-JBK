package com.tka.ClassObject;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		double area=Math.PI*radius*radius;
		double perimeter=2*Math.PI*radius;
		System.out.println(area);
		System.out.println(perimeter);
		
	}
}
