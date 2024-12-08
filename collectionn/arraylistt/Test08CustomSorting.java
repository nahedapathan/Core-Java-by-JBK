package collectionn.arraylistt;

import java.util.ArrayList;

public class Test08CustomSorting {

	public static void main(String[] args) {
		ArrayList<Student> s1=new ArrayList<Student>();
		s1.add(new Student(101,"vivek","noida"));
		s1.add(new Student(102,"Amit","Delhi"));
		s1.add(new Student(101,"Vivek","Noida"));
		s1.add(new Student(100,"Neha","Patna"));
		System.out.println("s1 :"+s1);
		
		s1.sort(new MyCompare());
		System.out.println("s1 :"+s1);
		
	}
}
