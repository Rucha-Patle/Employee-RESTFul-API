package com.employeeRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeRestAPI.dao.EmployeeDao;
import com.employeeRestAPI.dao.EmployeeRepository;
import com.employeeRestAPI.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao ed;
	
	public List<Employee> getAllEmployee() {
		return ed.getAllEmployee();
	}
	
	public Employee getEmpbyId(int id) {
		return ed.getEmpbyId(id);
	}

	public String saveEmployee(Employee emp) {
		return ed.saveEmployee(emp);
	}

	public String updateEmployee(Employee emp) {
		return ed.edupdateEmployee(emp);
		
	}

	public String deleteEmployee(int id) {
		return ed.deleteEmployee(id);
	}

}
