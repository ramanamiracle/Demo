<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Struts2</title>
</head>
<body>

<s:actionerror/>

<s:form action="Login">

<s:textfield name="username" key="lable.username" />
<s:password name="password" key="lable.password" />
<s:submit key="lable.submit" method="execute" />

</s:form>


</body>
</html>