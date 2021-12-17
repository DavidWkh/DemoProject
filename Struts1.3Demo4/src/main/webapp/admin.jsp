<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Page</title>
</head>

	<body>
		<table border="3" width="100%">
			<tr>
				<th>First Name</th>
				<th>Middle Name</th>
				<th>Last Name</th>
				<th>User ID</th>
				<th>Password</th>
				<th>Date Of Birth</th>
				<th>Gender</th>
				<th>Email</th>
				<th>Address</th>
				<th>Postcode</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>User Type</th>
				<th>Action</th>
			</tr>
			<c:forEach var="a" items="${users}">
				<tr>
					<td><c:out value="${a.fname}" /></td>
					<td><c:out value="${a.mname}" /></td>
					<td><c:out value="${a.lname}" /></td>
					<td><c:out value="${a.userid}" /></td>
					<td><c:out value="${a.password}" /></td>
					<td><c:out value="${a.dob}" /></td>
					<td><c:out value="${a.gender}" /></td>
					<td><c:out value="${a.email}" /></td>
					<td><c:out value="${a.address}" /></td>
					<td><c:out value="${a.postcode}" /></td>
					<td><c:out value="${a.city}" /></td>
					<td><c:out value="${a.state}" /></td>
					<td><c:out value="${a.country}" /></td>
					<td><c:out value="${a.user_type}" /></td>
					<td>
						<a:form action="/admin">
							<a:hidden property="userid" value="${a.userid}"/>
							<a:submit property ="action" value="update" />
							<a:submit property ="action" value="delete" /> 	
						</a:form>
							</td>
						
				</tr>
			</c:forEach>
		</table>
		<a:form action="/admin">
		<a:submit property="action" value="create" />
		<a:submit property="action" value="back" />
		</a:form>
	</body>
	<hr />
	<a:errors />

</html>
