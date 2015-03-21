<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>

<style type="text/css">
@IMPORT url("css/style.css");
</style>

<script src="<%=request.getContextPath() %>/js/scripts.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css" />

<s:head/>
</head>

<body>

<%=request.getContextPath() %>

	<p>
		<s:url id="localeEN"  action="">
			<s:param name="request_locale">en</s:param>
		</s:url>
		<s:url id="localeDE"  action="">
			<s:param name="request_locale">de</s:param>
		</s:url>
		<s:a href="%{localeEN}">English</s:a>
		<s:a href="%{localeDE}">German</s:a>
	</p>

	<s:if test="hasActionErrors()">
		<div id="fieldErrors">
			<s:actionerror />
		</div>
	</s:if>

	<s:form action="saveOrUpdateUser" namespace="User">



		<s:textfield name="id" label="Id" />
		<s:textfield name="name" label="User Name" />

		<s:radio name="gender" label="Gender" list="{'Male','Female'}" />

		<s:select name="country" list="{'India','USA','UK'}" headerKey=""
			headerValue="Select" label="Select a country" />

		<s:textarea name="aboutyou" label="About You" />

		<s:checkbox name="mailinglist"
			label="Would you like to join our mailing list?" />
		<s:submit />



	</s:form>

	<s:if test="userList.size() > 0">
		<div class="content">
			<table class="userTable" cellpadding="5px">
				<tr class="even">
					<th>Name</th>
					<th>Gender</th>
					<th>Country</th>
					<th>About You</th>
					<th>Mailing List</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<s:iterator value="userList" status="userStatus">
					<tr
						class="<s:if test="#userStatus.odd == true ">odd</s:if> <s:else>even</s:else>">
						<td><s:property value="name" /></td>
						<td><s:property value="gender" /></td>
						<td><s:property value="country" /></td>
						<td><s:property value="aboutyou" /></td>
						<td><s:property value="mailinglist" /></td>
						<td><s:url id="editURL" action="editUser">
								<s:param name="id" value="%{id}"></s:param>
							</s:url> <s:a href="%{editURL}">Edit</s:a></td>
						<td><s:url id="deleteURL" action="deleteUser">
								<s:param name="id" value="%{id}"></s:param>
							</s:url> <s:a href="%{deleteURL}">Delete</s:a></td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</s:if>

</body>
</html>