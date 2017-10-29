package com.mahesh.service;

import java.sql.SQLException;
import java.util.List;

import com.mahesh.dao.EmployeeDAO;
import com.mahesh.domain.EmployeeDomain;

public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * 
	 */
	public EmployeeDAO employeeDAO;

	/**
	 * @param employeeDAO
	 */
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	/* (non-Javadoc)
	 * @see com.mahesh.service.EmployeeService#getEmployees()
	 */
	public List<EmployeeDomain> getEmployees() {
		List<EmployeeDomain> list = null;
		try {
			list = employeeDAO.getAllEmployees();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	


}
