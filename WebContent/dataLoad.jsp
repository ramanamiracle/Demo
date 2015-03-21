<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>   
<%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:actionerror/>

<s:text name="Please fill in the form below:" />

<s:form action="display" method="POST" enctype="mutlipart/form-data">

<s:textfield name="name" label="User Name"></s:textfield>

<s:password name="password" label="Password"></s:password>

<s:textarea name="bio" label="About You" cols="20" rows="3" wrap="true"></s:textarea>

<s:checkbox name="receiveUpdates" fieldValue="true" label="Check to receive updates."></s:checkbox>

<s:checkboxlist list="countryList" name="country" label="Country" ></s:checkboxlist>

<s:select list="{'Developer','Manager','Customer'}" name="rolesSelect" multiple="true"></s:select>

<s:checkboxlist list="{'Developer','Manager','Customer'}" name="roleCheckbox"></s:checkboxlist>

<s:radio list="{'Developer','Manager','Customer'}" name="rolesRadio" multiple="true"></s:radio>

<s:doubleselect list="{'Developer','Manager','Tester'}" name="doubleSelectRole" label="Role"
doubleName="doubleSelectExpertise" doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})" >
</s:doubleselect>
	
<s:submit key="label.login" method="execute" />

</s:form>


</body>
</html>