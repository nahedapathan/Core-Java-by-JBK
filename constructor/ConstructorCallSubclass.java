package in.tka.constructor;

public class ConstructorCallSubclass extends ConstructorCallParent{
	
	ConstructorCallSubclass()
	{
		System.out.println("Constructor of Subclass");
	}
	
	ConstructorCallSubclass(int num)
	{
		System.out.println("Constructor with args");
	}
	
	void display()
	{
		System.out.println("Hello");
	}
}
