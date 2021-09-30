package info.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import info.company.entity.Company;
import info.company.service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
private CompanyService companyservice;
	@PostMapping("/savecompany")
	public Company m1(@RequestBody Company company) {
		return companyservice.savedata(company);
		
	}
	@GetMapping("/getcompany/{id}")
	public Company m2( @PathVariable("id") long Mani) {
		return companyservice.getdata(Mani);
		
	}

}
