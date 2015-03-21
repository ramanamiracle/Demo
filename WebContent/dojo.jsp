<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<sx:head />
</head>
 
<body>
<h1>Struts 2 datetimepicker example</h1>
 
<s:form action="resultAction" namespace="/" method="POST" >
 
<sx:datetimepicker name="date1" label="Format (dd-MMM-yyyy)" 
displayFormat="dd-MMM-yyyy" value="todayDate" />
 
<sx:datetimepicker name="date2" label="Format (dd-MMM-yyyy)" 
displayFormat="dd-MMM-yyyy" value="%{'2010-01-01'}"/>
 
<sx:datetimepicker name="date3" label="Format (dd-MMM-yyyy)" 
displayFormat="dd-MMM-yyyy" value="%{'today'}"/>

<sx:autocompleter label="What's your lucky number?" 
name="yourLuckyNumber" autoComplete="false"
list="{'1','12','13','14','21','22','23','24',
'31','32','33','34','41','42','43','44'}" />
 
<sx:autocompleter label="What's your favorite web framework?" 
list="webframeworks" name="yourFavWebFramework" />

<s:url id="databaseList" action="databaseJSON" />
 
<sx:autocompleter label="What's your favorite Database Server?" 
href="%{databaseList}" name="yourFavDatabase" />

 
<s:submit value="submit" name="submit" />
 
</s:form>
 
</body>
</html>