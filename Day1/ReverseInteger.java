package Day1;

import java.util.Scanner;

public class ReverseInteger {

	public static int ReversedInteger(int number)
	{
		int reversed=0;
		while(number!=0)
		{
			int digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int reversedNumber=ReversedInteger(number);
		System.out.println(reversedNumber);
	}

}
