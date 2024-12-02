package collection.TreeSet01;

public class Student implements Comparable {

	int sid;
	String sname;
	String scity;
	int marks;
	
	public Student(int sid, String sname, String scity, int marks) {
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



	public int compareTo(Object o) {
		Student s=(Student) o;
		if(this.marks==s.marks)
		{
			return 0;
		}
		else if(this.marks > s.marks)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
