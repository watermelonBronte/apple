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
		<form action="asset_category/test_AssetCategory_updateAssetCategory.action"
			method="post">
			
			资产类别ID
			<input type="text" name="acid" value="${acid}" readonly="readonly"/>
			<br />
			资产类别编号
			<input type="text" name="accode" value="${accode}"/>
			<br />
			资产类别名称
			<input type="text" name="acname" value="${acname}"/>
			<br />
			上级资产类别ID
			<input type="text" name="supacid" value="${supacid}"/>
			<br />
			上级资产类别名称
			<input type="text" name="supacname" value="${supacname}"/>
			<br />
			<input type="submit" value="更新" />
		</form>


	</body>
</html>
