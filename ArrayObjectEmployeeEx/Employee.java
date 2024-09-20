package ArrayObjectEmployeeEx;

public class Employee {
	int empId;
	String empName;
	String dept;
	double sal;
	String mob;
	
	
	public Employee() {
		empId=0;
		empName=null;
		dept=null;
		sal=0;
		mob=null;
	}

	public Employee(int empId, String empName, String dept, double sal, String mob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.sal = sal;
		this.mob = mob;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", sal=" + sal + ", mob=" + mob
				+ "]";
	}
	
	
	
	

}
