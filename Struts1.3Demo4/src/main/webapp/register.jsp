<%@ taglib uri="http://struts.apache.org/tags-html" prefix="r"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Register</title>
</head>
	
<r:form action="/register">
	<h1>Register User</h1>
	<label>First Name:      </label>
	<r:text property="firstname"/><br>
	<label>Middle Name:     </label>
	<r:text property="middlename"/><br>
	<label>Last Name:       </label>
	<r:text property="lastname"/><br>
	<label>Username:        </label>
	<r:text property="user_id"/><br>
	<label>Password:        </label>
	<r:text property="password"/><br>
	<label>Date Of Birth:   </label>
	<r:text property="dateofbirth"/><br>
	<label>Gender:          </label>
	<r:select property="gender">
		<r:option value="">--select gender--</r:option>
		<r:option value="male">Male</r:option>
		<r:option value="female">Female</r:option>
	</r:select><br>
	<label>Email:           </label>
	<r:text property="email"/><br>
	<label>Address:         </label>
	<r:text property="address"/><br>
	<label>Postcode:         </label>
	<r:text property="postcode"/><br>
	<label>State:           </label>
	<r:select property="state">
		<r:option value="">--select state--</r:option>
		<r:optionsCollection name="registerForm" property="statelist" label="stateName" value="stateId"/>
	</r:select><br>	
	<label>City:            </label>
	<r:select property="city">
		<r:option value="">--select city--</r:option>
		<r:optionsCollection name="registerForm" property="citylist" label="cityName" value="cityName"/>
	</r:select><br>	
	<label>Country:         </label>
	<r:text property="country"/><br>
	<r:submit property="action" value="Register"/>
	<r:submit property="action" value="Back"/>
	<hr />
	<r:errors />
</r:form>
</html>