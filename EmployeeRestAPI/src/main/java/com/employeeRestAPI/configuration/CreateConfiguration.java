package com.employeeRestAPI.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employeeRestAPI.entity.Employee;

public class CreateConfiguration {

	public SessionFactory createCnfiguration() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		return sf;
	}
}
