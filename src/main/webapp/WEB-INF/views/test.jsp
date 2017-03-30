<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test</title>
</head>
<body>
<form id="my" name="myform" action="/aplibrary/insertInfo" method="post">
<table>
<tr>
<!--  
<td>PERMISSION_ID<input type="text" id="roleId" name="permissionId"></td><br>
<td>PERMISSION_NAME<input type="text" id="permissionName" name="permissionName"></td><br>
-->
<td>libraryName<input type="text" id="permissionId" name="libraryName"></td><br>
<td>libraryCode<input type="text" id="operationId" name="libraryCode"></td><br>
<td>libraryDesc<input type="text" id="operationId" name="libraryDesc"></td><br>
<input type="submit">
</tr>
</table>
</form>

</body>
</html>