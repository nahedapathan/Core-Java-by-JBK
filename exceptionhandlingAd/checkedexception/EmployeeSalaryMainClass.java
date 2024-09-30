package exceptionhandling.checkedexception;

public class EmployeeSalaryMainClass {
	public static void main(String[] args) {
		
		EmployeeSalary emp=new EmployeeSalary();
		try {
			emp.ValidateSalary(1000);
		} catch (InvalidSalaryException e) {
		    e.printStackTrace();
		}
	}

}
