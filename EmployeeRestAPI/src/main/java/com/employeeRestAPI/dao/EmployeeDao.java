package com.employeeRestAPI.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeeRestAPI.entity.Employee;

@Repository
public class EmployeeDao  {

	@Autowired
	private EmployeeRepository er;
	
	@Autowired
	private SessionFactory sf;

	public List<Employee> getAllEmployee() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Criteria crt = session.createCriteria(Employee.class);
		List<Employee> emp = crt.list();
		tr.commit();
		return emp;
	}
	
	public Employee getEmpbyId(int id) {
		Optional<Employee> emp=er.findById(id);
		
		if(emp.isPresent())
		{
			return emp.get();
		}
		throw new RuntimeException("Employee is not present of this id"+id);
		
	}

	public String saveEmployee(Employee emp) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp);
		tr.commit();
		return "Employee saved successfully";
	}

	public String edupdateEmployee(Employee emp) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(emp);
		tr.commit();
		return "Employee updated successfully";
	}

	public String deleteEmployee(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp=new Employee();
		emp.setId(id);
		er.delete(emp);
		tr.commit();
		return "Employee deleted successfully";
	}
}
