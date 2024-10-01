package Test;

/*
 * 2.Write a program to swap two variables without using a third variable.
 */
public class Program2 {

	public static void main(String[] args) {
		int a=10;
		int b=25;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
	}
}
