package manikanta;

import info.employee.entity.Employee;

public class EmployeeCompany {
 private Company company;
 private Employee employee;
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public EmployeeCompany() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeCompany(Company company, Employee employee) {
	super();
	this.company = company;
	this.employee = employee;
}
@Override
public String toString() {
	return "EmployeeCompany [company=" + company + ", employee=" + employee + "]";
}
 
 
}
