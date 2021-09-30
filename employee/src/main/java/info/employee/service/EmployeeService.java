package info.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import info.employee.entity.Employee;
import info.employee.repository.EmployeeRepository;
import manikanta.Company;
import manikanta.EmployeeCompany;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;
	RestTemplate rst=new RestTemplate();
public Employee empsavedata(Employee employee) {
	return employeerepository.save(employee);
	
}
public Employee empgetdata(Long id) {
	return employeerepository.findById(id).get();
	
}
public EmployeeCompany getemployeecompany(long id) {
	Employee temprorey=employeerepository.findById(id).get();
	Company temp=rst.getForObject("http://localhost:8088/getcompany/"+temprorey.getCompanyId(),Company.class);
	EmployeeCompany employeeCompany=new EmployeeCompany();
	employeeCompany.setCompany(temp);
	employeeCompany.setEmployee(temprorey);
	return employeeCompany;
	
}


}
