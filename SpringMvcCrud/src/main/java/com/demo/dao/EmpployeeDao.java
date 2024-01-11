package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Employee;

@Component
public class EmpployeeDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	// add Employee
	@Transactional
	public void addEmployee(Employee emp) {
		hibernateTemplate.save(emp);
	}

	// get all employee
	public List<Employee> getallEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	// get all employee by id
	public Employee getEmployeeById(Long id) {
		return hibernateTemplate.get(Employee.class, id);
	}

	// update employee
	@Transactional
	public void updateEmp(Employee emp) {
		hibernateTemplate.update(emp);
	}

	// delete employee
	@Transactional
	public void deleteEmp(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Employee.class, id));
	}

}
