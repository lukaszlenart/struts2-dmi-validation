<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sign On</title>
</head>

<body>
<s:form action="Login!check" validate="true">
    <s:textfield key="username"/>
    <s:password key="password" />
    <s:submit/>
</s:form>
</body>
</html>
