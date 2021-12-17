<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="w"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
<head>
<title>User Information</title>
</head>
<w:form action="/welcome">
	<center>
		<table border="2" width="100%" cellpadding="10">
			<thead>
				<tr>
					<th colspan="2">Welcome</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>First Name</td>
					<td><c:out  value="${user.fname}"/></td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td><c:out  value="${user.mname}"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><c:out  value="${user.lname}"/></td> 
				</tr>
				<tr>
					<td>User ID</td>
					<td>
						<c:out  value="${user.userid}"/>
						<w:hidden property="userid" value="${user.userid}"/>
					</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" value="${user.password}" /></td>
				</tr>
				<tr>
					<td>Date Of Birth</td>
					<td><c:out  value="${user.dob}"/></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><c:out  value="${user.gender}"/></td> 
				</tr>
				<tr>
					<td>Email</td>
					<td><c:out value="${user.email}" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><c:out  value="${user.address}" /></td>
				</tr>
				<tr>
					<td>Postcode</td>
					<td><c:out value="${user.postcode}" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><c:out value="${user.city}" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><c:out value="${user.state}" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><c:out value="${user.country}" /></td>
				</tr>
				<tr>
					<td>User Type</td>
					<td><c:out  value="${user.user_type}"></c:out>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
					<w:submit property="action" value="update"/>
					<w:submit property="action" value="back" /></td>
				</tr>
			</tbody>
		</table>
	</center>
</w:form>