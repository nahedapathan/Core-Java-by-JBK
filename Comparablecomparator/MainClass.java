package Comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
	    al.add(new Student(201,"Vinit"));
	    al.add(new Student(301,"Vikas"));
	    al.add(new Student(501,"Deepti"));
	    al.add(new Student(601,"Priya"));
	    System.out.println("Sorting By NAme: ");
	    
	    
	    Collections.sort(al,new AgeComparator());
	    for(Student student:al)
	    {
	    	System.out.println(student.rollno+"  "+student.name);
	    }
	}

}
