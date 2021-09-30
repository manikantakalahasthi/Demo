package info.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.company.entity.Company;
import info.company.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyrepository;
	
public Company savedata(Company company) {
	return companyrepository.save(company);
	
}
public Company getdata(Long id){
	return companyrepository.findById(id).get();
	
}
}
