package ArrayOfObject;

public class Student {

	String name;
	int rollno;
	public Student() {
		name=null;
		rollno=0;
	}
	public Student(String name, int rollno) {
	
		this.name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
	
	
}
