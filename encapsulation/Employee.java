package in.tka.encapsulation;

public class Employee {

	private int ssn;
	private String empname;
	private int empAge;
	
	//getter and Setter methods
	public int getEmpSSN()
	{
		return ssn;
	}
	
	public String getEmpname() {
		return empname;
	}
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int newValue)
	{
		empAge=newValue;
	}
	
	public void setEmpname(String newValue) {
		empname=newValue;
		
	}
	public void  setEmpSSN(int newValue)
	{
		ssn=newValue;
	}
}
