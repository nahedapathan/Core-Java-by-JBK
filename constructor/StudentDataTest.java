package in.tka.constructor;

public class StudentDataTest {

	public static void main(String[] args) {
		StudentData myobj=new StudentData();
		System.out.println("Student name is "+myobj.getStuName());
		System.out.println("Student age is "+myobj.getStuAge());
		System.out.println("Student id is "+myobj.getStuID());
		
		StudentData myobj2=new StudentData(555,"jbk",25);
		System.out.println("Student name is "+myobj2.getStuName());
		System.out.println("Student age is "+myobj2.getStuAge());
		System.out.println("Student id is "+myobj2.getStuID());
		
	}
}
