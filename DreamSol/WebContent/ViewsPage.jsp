<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<s:iterator value="e1">
<tr><td>NAME:</td><td><s:property value="userName"/></td></tr>
bod:<s:property value="bod" />
MOBILE:<s:property value="mobile"/>
<br/>
</s:iterator>
</body>
</html>