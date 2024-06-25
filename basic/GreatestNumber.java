package com.tka.basic;

public class GreatestNumber {
	//Greatest of two Number
	//Assuming numbers are always Positive
	public static void main(String[] args) {
		 int a=12;
		 int b=-11;
		 
		 if(a<0 || b<0)
		 {
			 System.out.println("Age cant ");
		 }
		 if(a==b)
		 {
			 System.out.println("Both are Same");
		 }
		 if(a>b)
		 {
			 System.out.println("A is Greator");
		 }
		 else if(b>a)
		 {
			 System.out.println("B is Greator");
		 }
	}

}
