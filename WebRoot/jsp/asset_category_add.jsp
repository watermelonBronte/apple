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
	<h1>创建资产类别</h1>
		<form action="asset_category/test_AssetCategory_createAssetCategory.action"
			method="post">
			
			资产类别编号
			<input type="text" name="accode" value="123"/>
			<br />
			资产类别名称
			<input type="text" name="acname" value="长江一号"/>
			<br />
			上级资产类别ID
			<input type="text" name="supacid" value="234"/>
			<br />
			上级资产类别名称
			<input type="text" name="supacname" value="黄河二号"/>
			<br />
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
