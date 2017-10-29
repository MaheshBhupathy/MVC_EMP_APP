<%@page isELIgnored="false" import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h2>Hello World!</h2>
	<a href="getEmployees">Employees</a>
	<br>
	<c:choose>
		<c:when test="${not empty employees}">
			<table style="width: 100%">
				<thead>
					<tr>Employees List
					</tr>
				</thead>
				<tbody>

					<tr>
						<td>EMP NO.</td>
						<td>EMP NAME</td>
						<td>JOB</td>
						<td>MGR</td>
						<td>HIREDATE</td>
						<td>SALARY</td>
						<td>COMMISSION</td>
						<td>DEPT NO.</td>
					</tr>

					<c:forEach items="${employees}" var="employee" varStatus="status">

						<tr>
							<td><c:out value="${employee.getEmpno()}"></c:out></td>
							<td><c:out value="${employee.getEname()}"></c:out></td>
							<td><c:out value="${employee.getJob()}"></c:out></td>
							<td><c:out value="${employee.getMgr()}"></c:out></td>
							<td><c:out value="${employee.getHiredate()}"></c:out></td>
							<td><c:out value="${employee.getSal()}"></c:out></td>
							<td><c:out value="${employee.getComm()}"></c:out></td>
							<td><c:out value="${employee.getDeptno()}"></c:out></td>
						</tr>

					</c:forEach>
				</tbody>
			</table>

		</c:when>
		<c:otherwise>
			<p>Results Not found</p>
		</c:otherwise>
	</c:choose>
</body>
</html>
