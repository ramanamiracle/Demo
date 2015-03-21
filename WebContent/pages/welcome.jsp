<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
<title>Welcome Page - Struts 2 - Login Application</title>

<style type="text/css">
.errors {
	background-color:#FFCCCC;
	border:1px solid #CC0000;
	width:400px;
	margin-bottom:8px;
}
.errors li{ 
	list-style: none; 
}
</style>

</head>

<body>
	<h2>
		<s:property value="getText('welcome.hello')" /> : <s:property value="username"/>
	</h2>
	Welcome to Struts 2 world.

	<s:if test="hasActionErrors()">
		<div class="errors">
			<s:actionerror />
		</div>
	</s:if>

	<s:if test="hasActionMessages()">
		<div class="welcome">
			<s:actionmessage />
		</div>
	</s:if>


</body>
</html>