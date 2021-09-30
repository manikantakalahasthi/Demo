package info.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.company.entity.Company;
@Repository
public interface CompanyRepository  extends JpaRepository<Company, Long>{

}
