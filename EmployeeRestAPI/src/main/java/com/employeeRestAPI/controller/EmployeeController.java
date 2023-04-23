package com.employeeRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeRestAPI.entity.Employee;
import com.employeeRestAPI.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	@GetMapping("allemp")
	public List<Employee> getAllEmployee()
	{
		return es.getAllEmployee();
	}
	
	@GetMapping("emp/{id}")
	public Employee getEmpbyId(@PathVariable int id)
	{
		return es.getEmpbyId(id);
	}
	
	@PostMapping("saveemp")
	public String saveEmployee(@RequestBody Employee emp) {
		return es.saveEmployee(emp);
	}
	
	@PutMapping("emp/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Employee emp)
	{
		emp.setId(id);
		return es.updateEmployee(emp);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id)
	{
		return es.deleteEmployee(id);
	}
}
