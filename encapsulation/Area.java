package in.tka.encapsulation;

public class Area {

	//field to calculate area
	int length;
	int breadth;
	
	//constructor to initialize values
	Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	//Method to Calculate area
	public void getArea()
	{
		int area=length*breadth;
		System.out.println(area);
	}
	
}
