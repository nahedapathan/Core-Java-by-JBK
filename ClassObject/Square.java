package com.tka.ClassObject;

import java.util.Scanner;

public class Square {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int side=sc.nextInt();
		int area=side*side;
		int perimeter=4*side;
		System.out.println(area);
		System.out.println(perimeter);
	}
}
