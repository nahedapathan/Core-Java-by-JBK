package collection.priorityQueue;

public class Student {

	int sid;
	String sname;
	String scity;
	float marks;
	public Student(int sid, String sname, String scity, float marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", marks=" + marks + "]";
	}
	
	
}
