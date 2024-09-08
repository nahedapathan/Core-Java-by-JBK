package com.tka.ClassObject;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		
		double perimeter=side1+side2+side3;
		System.out.println(perimeter);
		
		double s=perimeter/2;
		
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
		System.out.println(area);
	}
}
