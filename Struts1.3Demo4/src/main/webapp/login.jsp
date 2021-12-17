<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Log In</title>
	</head>
<h:form action="/login">
	<h:text property="username" />
	<h:password property="password" />
	<h:submit property="action" value="login"/>
	<h:submit property="action" value="register"/>
		
	<hr />
	<h:errors/>
</h:form>

</html>