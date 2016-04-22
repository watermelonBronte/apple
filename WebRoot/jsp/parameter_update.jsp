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
		<form action="parameter/test_Parameter_updateParameter.action"
			method="post">
			
			参数信息ID
			<input type="text" name="pid" value="${pid}" readonly="readonly"/>
			<br />
			参数信息名称
			<input type="text" name="pname" value="${pname}"/>
			<br />
			参数信息值
			<input type="text" name="pnum" value="${pnum}"/>
			<br />
			参数类型ID
			<input type="text" name="ptypeid" value="${ptypeid}"/>
			<br />
			参数信息名称
			<input type="text" name="ptypename" value="${ptypename}"/>
			<br />
			<input type="submit" value="更新" />
		</form>


	</body>
</html>
