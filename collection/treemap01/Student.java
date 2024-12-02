package collection.treemap01;

public class Student implements Comparable {

	String sname;
	int marks;
	public Student(String sname, int marks) {
		super();
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(this.marks>s.marks)
		{
			return -1;
		}
		else if(this.marks==s.marks)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	
}
