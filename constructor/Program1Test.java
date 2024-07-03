package in.tka.constructor;

public class Program1Test {

	public static void main(String[] args) {
		Program1 p1=new Program1();
		Program1 p2=new Program1(30);
		Program1 p3=new Program1(30,40);
		
		p1.display();
		p2.display();
		p3.display();
		
	}

}
/*
Inside 1st Constructor
Inside 2nd Constructor
Inside 3rd Constructor
Value1->10
Value2->20
Value1->30
Value2->0
Value1->30
Value2->40
 */
