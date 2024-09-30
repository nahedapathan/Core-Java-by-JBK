package exceptionhandling.checkedexception;

public class EmployeeSalary {

	void ValidateSalary(double salary) throws InvalidSalaryException{
		if(salary<1500)
		{
			throw new InvalidSalaryException("Salary is Invalid ");
		}
		System.out.println("Your Salary is :"+salary);
	}
}
