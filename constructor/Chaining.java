package in.tka.constructor;

public class Chaining {

	Chaining()
	{
		System.out.println("Default Constructor");
	}
	
	public Chaining(String str)
	{
		this();
		System.out.println("Parameterized Constructor");
	}
	
	public Chaining(String str,int num)
	{
		this("Hello");
		System.out.println("Parameterized constructor with double args");
	}
	
	public Chaining(int num1,int num2,int num3)
	{
		this("hello",2);
		System.out.println("Parameterized Constructor with three args");
	}
}
