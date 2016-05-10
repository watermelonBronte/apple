<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
		<!-- <form action="admin_login/login.action" method="post">
  	姓名：<input type="text" name="username" /> <br/>
  	密码：<input type="text" name="pwd" />
  	<input type="submit" value="提交" />
  	</form>
   -->
		<!-- 资源类别 -->
	<!-- 资产 -->
		<a href="asset/asset_Asset_pageAsset.action">资产列表</a>
		<br>
	<hr />

		<a href="finance/finance_Finance_pageFinance.action">财务入账列表</a>
		<br>
			<hr />

		<a href="asset_category/test_AssetCategory_pageAssetCategory.action">测试资源类别</a>
		<br>
		<hr />
		<!-- 部门 -->
		<a href="department/test_Department_pageDepartment.action">测试部门</a>
		<br>
		<hr />

		<!-- 参数 -->
		<a href="parameter/test_Parameter_pageParameter.action">测试参数信息</a>
		<br>
	


	
	
		<a href="repairs/repairs_Repairs_pageRepairs.action">维修</a>
		<br>
	<a href="scrap/scrap_Scrap_pageScrap.action">报废</a>
		<br>
	<a href="transBills/transBills_TransBills_pageTransBills.action">调拨</a>
		<br>
	
	</body>
</html>
