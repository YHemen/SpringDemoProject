import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeSalaryDetailsTest {
	EmployeeDetails empdata = new EmployeeDetails();
	EmployeeSalaryDetails empsal = new EmployeeSalaryDetails();

	@Test
	public void testSalaryHike() {
		empdata.setEmpName("SreeHari");
		empdata.setSalary(8000);
		empdata.setAge(28);
		double appraisal = empsal.calcAppraisal(empdata);
		assertEquals(500,appraisal,0.0);
	}
	
	public void testYearlySalary() {
		empdata.setEmpName("SreeHari");
		empdata.setSalary(8000);
		empdata.setAge(28);
		double yearlysal = empsal.AnnualSalary(empdata);
		assertEquals(96000, yearlysal, 0.0);
	}
}
