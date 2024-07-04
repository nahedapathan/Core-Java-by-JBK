package in.tka.encapsulation;


public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmpname("Naheda");
		obj.setEmpAge(22);
		obj.setEmpSSN(12323);
		System.out.println(obj.getEmpname());
		System.out.println(obj.getEmpAge());
		System.out.println(obj.getEmpSSN());
	}
}
