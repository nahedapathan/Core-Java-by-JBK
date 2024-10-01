package Test;

import java.util.Scanner;

/*
 * 12.Write a program to count the number of vowels in a string.
 */

public class Programm12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		String newStr=str.toLowerCase();
		int vowCount=0;
		for(int i=0;i<str.length();i++)
		{
			char c=newStr.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
			{
				vowCount++;
			}
		}
		System.out.println("The Number of Vowels in String is :"+vowCount);
	}

}
