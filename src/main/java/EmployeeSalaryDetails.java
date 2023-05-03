
public class EmployeeSalaryDetails {
	
	public double AnnualSalary(EmployeeDetails employee) {
		double salaryperyear=0.0;
		salaryperyear = employee.getSalary()*12;
		return salaryperyear;
	}
	public double calcAppraisal(EmployeeDetails employee) {
	double hike = 0.0;
	if(employee.getSalary()>= 50000) {
		hike = 5000.00;
	}
	else {
		hike = 500.00;
	}
	return hike;
	}
}
