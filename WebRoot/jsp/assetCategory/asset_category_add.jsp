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
	<h3>添加资产类别</h3>
		<form action="asset_category/test_AssetCategory_createAssetCategory.action"
			method="post">
			资产类别编号
			<input type="text" name="accode" value="QW12"/>
			<br />
			资产类别名称
			<input type="text" name="acname" value="空调"/>
			<br />
			上级资产类别ID
			<input type="text" name="supacid" value="1"/>
			<br />
			上级资产类别名称
			<input type="text" name="supacname" value="家用电器"/>
			<br />
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
