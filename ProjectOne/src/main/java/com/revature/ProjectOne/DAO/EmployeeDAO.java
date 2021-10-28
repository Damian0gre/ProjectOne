package com.revature.ProjectOne.DAO;

import java.util.List;

import com.revature.ProjectOne.ENT.Employee;

public interface EmployeeDAO {
	Employee createEmployee(Employee employee);

	Employee getEmployeeById(int eid);

	List<Employee> getAllEmployees();

	Employee updateEmployee(Employee employee);

	boolean deleteEmployee(Employee employee);

}
