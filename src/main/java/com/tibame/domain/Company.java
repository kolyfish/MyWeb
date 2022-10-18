package com.tibame.domain;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String companyName;
	private List<Employee> employees = new ArrayList<>();
	private Boss boss; 
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompaynyNmae(String companyName) {
		this.companyName = companyName;
	}
	public void add(Employee emp)
	{
		this.employees.add(emp);
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public Boss getBoss() {
		return boss;
	}
	public void setBoss(Boss boss) {
		this.boss = boss;
	}
	
	
	
	
}
