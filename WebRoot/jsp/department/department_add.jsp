<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<base href="<%=basePath%>">
	<head>



	</head>

	<body>
	<h1>创建部门</h1>
		<form action="department/test_Department_createDepartment.action"
			method="post">
			
			部门名称
			<input type="text" name="dname" value="开发部"/>
			<br />
			
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
