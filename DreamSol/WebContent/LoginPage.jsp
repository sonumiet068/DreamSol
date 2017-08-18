<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login Page</title>
</head>
<sj:head/>
<body>
<table>
<form action="insertion"  method="post">
<tr><td>UserName:</td><td><input type="text" name="userName"/></td></tr>
<tr><td>Mobile:</td><td><input type="text" name="mobile"/></td></tr>
<tr><td>Date:</td><td><sj:datepicker name="bod" placeholder="DOB" id="13"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="pass"/></td></tr>
<tr><td><input type="submit" name="Submit" value="Login" /></td></tr>
</form>
</table>
</body>
</html>