package ComparableComparator.student;

import java.util.ArrayList;
import java.util.Collections;

public class MyMainClass {
	
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("naheda",21));
		al.add(new Student("Preeti",22));
		al.add(new Student("Riya",20));
		
		System.out.println("Sorting by name");
		Collections.sort(al,new AgeComparator());
		
		for(Student stu:al)
		{
          System.out.println(stu.name+" "+stu.age);
		}
	}

}
