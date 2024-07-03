package in.tka.constructor;

public class Program1 {

	int value1;
	int value2;
	
	Program1(){
		value1=10;
		value2=20;
		System.out.println("Inside 1st Constructor");
	}
	
	Program1(int a)
	{
		value1=a;
		System.out.println("Inside 2nd Constructor");
	}
	
	Program1(int a,int b)
	{
		value1=a;
		value2=b;
		System.out.println("Inside 3rd Constructor");
		
	}
	
	public void display() {
		System.out.println("Value1->"+value1);
		System.out.println("Value2->"+value2);
	}
}
