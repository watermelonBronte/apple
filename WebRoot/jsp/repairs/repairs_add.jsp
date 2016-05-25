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

	<head>
			<title>添加维修单</title>
			<base href="<%=basePath%>">
		<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href='http://fonts.useso.com/css?family=Open+Sans:400,700'
			rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

		<script
			src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js"
			type="text/javascript"></script>

		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/theme.css">
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/premium.css">
		<link rel="apple-touch-icon-precomposed" sizes="144x144"
			href="../assets/ico/apple-touch-icon-144-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="114x114"
			href="../assets/ico/apple-touch-icon-114-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="72x72"
			href="../assets/ico/apple-touch-icon-72-precomposed.png">
		<link rel="apple-touch-icon-precomposed"
			href="../assets/ico/apple-touch-icon-57-precomposed.png">
		<script type="text/javascript"
			src="http://www.js-css.cn/jscode/jquery.min.js"></script>
			


	</head>

	<body>
		
		<h1>
			填写维修单
		</h1>
		<form action="repairs/repairs_Repairs_createRepairs.action"
			method="post">
			资产ID
			<!--<input type="text" name="asset.aid" value="2" />-->
			<s:select list="assetList" listKey="aid" listValue="aid"
				name="asset.aid" />
			<br />
			送修人名称
			<input type="text" name="user.uid" value="user.uname" />
			<!--<s:select list="userList" listKey="uid" listValue="uname"
				name="user.uid" />
			-->
			${loginUname}
			<br />
			损坏情况
			<input type="text" name="recondition" value="非常严重" />
			<br />
			维修费用
			<input type="text" name="reprice" value="100" />
			￥
			<br />
			状态
			<!--0-维修中 1-维修完成-->
			<input type="radio" name="restate" value="0" checked="checked" />
			维修中
			<input type="radio" name="restate" value="1" />
			维修完成
			<br />
			<input type="submit" value="创建" />
		</form>

	</body>
</html>
