package info.employee.controller;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import info.employee.entity.Employee;
import info.employee.service.EmployeeService;
import manikanta.EmployeeCompany;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	@PostMapping("/saveemployee")
	public Employee m3(@RequestBody Employee employee) {
		return employeeservice.empsavedata(employee);
		
	}
 @GetMapping("/getemployee/{Id}")
 public Employee m4(@PathVariable("Id") long kanta) {
	return employeeservice.empgetdata(kanta);
	 
 }
 @GetMapping("/getemployeecompany/{id}")
 public EmployeeCompany m5(@PathVariable("id") long kalahasthi) {
	return employeeservice.getemployeecompany(kalahasthi);



 }
}
