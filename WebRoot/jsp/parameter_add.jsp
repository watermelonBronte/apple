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
		<h1> 
			422参数信息 
		</h1>
		<form
			action="parameter/test_Parameter_createParameter.action"
			method="post">

			参数信息名称
			<input type="text" name="pname" value="123"/>
			<br />
			参数信息值
			<input type="text" name="pnum" value="43"/>
			<br />
			参数信息类型ID
			<input type="text" name="ptypeid" value="12"/>
			<br />
			参数信息类型名称
			<input type="text" name="ptypename" value="34"/>
			<br />
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
