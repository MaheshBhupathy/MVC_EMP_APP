package com.mahesh.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mahesh.domain.EmployeeDomain;

public class EmployeeMapper	implements RowMapper<EmployeeDomain> {

	@Override
	public EmployeeDomain  mapRow(ResultSet rs, int rowNum) throws SQLException {

		EmployeeDomain emp = new EmployeeDomain();
		// EMPNO NUMBER(4)
		// ENAME VARCHAR2(10)
		// JOB VARCHAR2(9)
		// MGR NUMBER(4)
		// HIREDATE DATE
		// SAL NUMBER(7,2)
		// COMM NUMBER(7,2)
		// DEPTNO NUMBER(2)
		
		emp.setEmpno(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setJob(rs.getString(3));
		emp.setMgr(rs.getInt(4));
		emp.setHiredate(rs.getDate(5));
		emp.setSal(rs.getDouble(6));
		emp.setComm(rs.getDouble(7));
		emp.setDeptno(rs.getInt(8));
		
		
		return emp;
	}

	
	

}
