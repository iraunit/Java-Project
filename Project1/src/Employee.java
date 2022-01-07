import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

public class Employee {
	private int empID;
	private String empName;
	private String empDepartment;
	private String empAddress;
	private double empsalary;

		
	public Employee ()
	{
		
	}
	public Employee (int id) {
		this.empID=id;
	}
	public Employee (int id,String name) {
		this.empID=id;
		this.empName=name;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment=empDepartment;
	}
	public String getEmAddress() {
		return empAddress;
	}

	
	
}


