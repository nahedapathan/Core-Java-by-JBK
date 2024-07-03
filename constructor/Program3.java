package in.tka.constructor;

public class Program3 {

	int value1;
	int value2;
	
	Program3(){
       value1=10;
       value2=20;
       System.out.println("INside Constructor");
	}
	
	public void display() {
		System.out.println("value1->"+value1);
		System.out.println("value2->"+value2);
	}

}
