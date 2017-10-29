package com.mahesh.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mahesh.domain.EmployeeDomain;
import com.mahesh.mappers.EmployeeMapper;
import com.mahesh.util.SQLConstants;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public List<EmployeeDomain> getAllEmployees() throws SQLException {
		return  jdbcTemplate.query(SQLConstants.QUERY_FOR_ALL_EMPLOYEES, new EmployeeMapper());
		
	}

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
