package com.mahesh.dao;

import java.sql.SQLException;
import java.util.List;

import com.mahesh.domain.EmployeeDomain;

public interface EmployeeDAO {
	
	public List<EmployeeDomain> getAllEmployees() throws SQLException;
	
}
