package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.dao.EmpployeeDao;
import com.demo.model.Employee;

@Component
@Service
public class EmployeeService {

	@Autowired
	EmpployeeDao empployeeDao;

	// add employee
	public void addEmp(Employee emp) {
		empployeeDao.addEmployee(emp);
	}

	// get all employee
	public List<Employee> getallEmp() {
		return empployeeDao.getallEmployees();
	}

	// get emp by id
	public Employee getById(Long id) {
		return empployeeDao.getEmployeeById(id);
	}

	// update employee
	public void updateEmp(Employee emp) {
		empployeeDao.updateEmp(emp);
	}

	// delete employee
	public void deleteEmp(Long id) {
		empployeeDao.deleteEmp(id);
	}

}
