<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<title>File Download</title>
<body>
<h3>Struts 2 file download example</h3>
  <s:url id="fileDownload" namespace="/" action="download"></s:url>
   <h4>
     Download file - <s:a href="%{fileDownload}">sample.pdf</s:a>
   </h4>
</body>
</html>