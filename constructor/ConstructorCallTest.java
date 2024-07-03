package in.tka.constructor;

public class ConstructorCallTest {

	public static void main(String[] args) {
		ConstructorCallSubclass obj=new ConstructorCallSubclass();
		obj.display();
		
		ConstructorCallSubclass obj2=new ConstructorCallSubclass(10);
		obj2.display();
	}
}
