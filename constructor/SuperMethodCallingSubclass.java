package in.tka.constructor;

public class SuperMethodCallingSubclass extends SuperMethodCalling{
	
	void display()
	{
		System.out.println("Child class Method");
	}
	
	void printMsg()
	{
		display();
		super.display();
	}
}
