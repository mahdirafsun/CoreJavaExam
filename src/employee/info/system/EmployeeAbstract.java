package employee.info.system;

public abstract class EmployeeAbstract implements Employee{
	private int empId;
	private String empName;
	int sal;
	int benefit;
	public EmployeeAbstract(int empId) {
		super();
		this.empId = empId;
	}
	public EmployeeAbstract(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	@Override
	public int employeeId() {
		// TODO Auto-generated method stub
		return empId;
	}
	@Override
	public String employeeName() {
		// TODO Auto-generated method stub
		return empName;
	}
	@Override
	public void assignDepartment() {
		// TODO Auto-generated method stub
		
	}

	public int calculateSalary() {
		// TODO Auto-generated method stub
		return sal;
	}
	@Override
	public void benefitLayout() {
		int b = 0;
		benefit = b;
		
		

}
}
