package info.company.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long companyid;
	private String companyname;
	private String companylocation;
	public long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanylocation() {
		return companylocation;
	}
	public void setCompanylocation(String companylocation) {
		this.companylocation = companylocation;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(long companyid, String companyname, String companylocation) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		this.companylocation = companylocation;
	}
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", companylocation="
				+ companylocation + "]";
	}
	
	

}
