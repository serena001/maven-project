package hello;

import java.util.HashMap;
import java.util.List;

public class FormControllerBean {
	List<Employee> employeeLst;

	public List<Employee> getEmployeeLst() {
		return employeeLst;
	}

	public void setEmployeeLst(List<Employee> employeeLst) {
		this.employeeLst = employeeLst;
	}

	String select1;

	public String getSelect1() {
		return select1;
	}

	public void setSelect1(String select1) {
		this.select1 = select1;
	}
	
	Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
