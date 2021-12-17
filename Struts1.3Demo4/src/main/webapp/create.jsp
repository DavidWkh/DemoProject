<%@ taglib uri="http://struts.apache.org/tags-html" prefix="n"%>

<html>
<head>
<meta charset="utf-8">
<title>Create</title>
</head>
	
<n:form action="/create">
	<h1>Register User</h1>
	<label>First Name:      </label>
	<n:text property="firstname"/><br>
	<label>Middle Name:     </label>
	<n:text property="middlename"/><br>
	<label>Last Name:       </label>
	<n:text property="lastname"/><br>
	<label>Username:        </label>
	<n:text property="user_id"/><br>
	<label>Password:        </label>
	<n:text property="password"/><br>
	<label>Date Of Birth:   </label>
	<n:text property="dateofbirth"/><br>
	<label>Gender:          </label>
	<n:select property="gender">
		<n:option value="">--select gender--</n:option>
		<n:option value="male">Male</n:option>
		<n:option value="female">Female</n:option>
	</n:select><br>
	<label>Email:           </label>
	<n:text property="email"/><br>
	<label>Address:         </label>
	<n:text property="address"/><br>
	<label>Postcode:         </label>
	<n:text property="postcode"/><br>
	<label>State:           </label>
	<n:select property="state">
		<n:option value="">--select state--</n:option>
		<n:optionsCollection name="createForm" property="statelist" label="stateName" value="stateId"/>
	</n:select><br>	
	<label>City:            </label>
	<n:select property="city">
		<n:option value="">--select city--</n:option>
		<n:optionsCollection name="createForm" property="citylist" label="cityName" value="cityName"/>
	</n:select><br>	
	<label>Country:         </label>
	<n:text property="country"/><br>
	<label>User Type:         </label>
	<n:select property="user_type">
		<n:option value="user">User</n:option>
		<n:option value="admin">Admin</n:option>
	</n:select><br>	
	
	<n:submit property="action" value="Register"/>
	<n:submit property="action" value="Back"/>
	
	<hr />
	<n:errors />
</n:form>
</html>