package in.tka.constructor;

public class SuperExplicitSubclass extends SuperExpliciteParent{
	
	SuperExplicitSubclass(){
		super();
		System.out.println("Constructor of Subclass");
	}
	void display()
	{
		System.out.println("Hello");
	}
	
	
}
