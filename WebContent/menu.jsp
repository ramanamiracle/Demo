<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:url id="testUrlId" namespace="/" action="logout"></s:url>

<s:a errorText="Sorry your request had an error."
	href="%{testUrlId}">
	Logout
</s:a>