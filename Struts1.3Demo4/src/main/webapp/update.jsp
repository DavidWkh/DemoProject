<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="u"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
<head>
<title>Update Information</title>
</head>
<u:form action="/update">
	<center>
		<table border="1" width="30%" cellpadding="5">
			<thead>
				<tr>
					<th colspan="2">Enter Information Here</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>First Name</td>
					<td>
						<input type="text" name="fname" value="${user.fname}"/></td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td><input type="text" name="mname" value="${user.mname}" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" value="${user.lname}"/></td>
				</tr>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="userid" value="${user.userid}"/> 
					</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password" value="${user.password}" /></td>
				</tr>
				<tr>
					<td>Date Of Birth</td>
					<td><input type="text" name="dob" value="${user.dob}" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="text" name="gender" value="${user.gender}" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" value="${user.email}" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" value="${user.address}" /></td>
				</tr>
				<tr>
					<td>Postcode</td>
					<td><input type="password" name="postcode" value="${user.postcode}" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" value="${user.city}" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" value="${user.state}" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="country" value="${user.country}" /></td>
				</tr>
				<tr>
					<td>User Type</td>
					<td>
						<u:select property="user_type">
							<c:if test="${user.user_type=='admin'}">
								<u:option value="admin">Admin</u:option>
								<u:option value="user">User</u:option>
							</c:if>
							<c:if test="${user.user_type=='user'}">
								<u:option value="user">User</u:option>
								<u:option value="admin">Admin</u:option>
							</c:if>
						</u:select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
					<u:submit property="action" value="update"/>
					<u:submit property="action" value="back" /></td>
				</tr>
			</tbody>
		</table>
	</center>
</u:form>