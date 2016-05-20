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
		<title>添加调拨申请</title>
		<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		

		<script
			src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js"
			type="text/javascript"></script>

		<script type="text/javascript"
			src="http://www.js-css.cn/jscode/jquery.min.js"></script>

		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery.date_input.pack.js"></script>
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/calendar.css">
		<script type="text/javascript">
	$(function() {
		$('.date_picker').date_input();
	})
</script>


	</head>

	<body>

		<h1>
			创建调拨申请
		</h1>
		<form
			action="transBills/transBills_TransBills_createTransBills.action"
			method="post">
			资产ID
			<!--<input type="text" name="asset.aid" value="2" />-->
			<s:select list="assetList" listKey="aid" listValue="aid"
				name="asset.aid" />
			<br />
			调出人ID
			<!--<input type="text" name="userByOutuid.uid" value="1" />-->
			<s:select list="userList" listKey="uid" listValue="uname"
				name="userByOutuid.uid" />
			<br />
			调出时间
			<!--<input type="text" name="outdate" value="123" />-->

			<input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${outdate}" name="outdate" />
			<br />
			调出事由
			<input type="text" name="outname" value="1" />
			<br />
			状态
			<input type="radio" name="tbstate" value="0" checked="checked" />
			调拨中
			<input type="radio" name="tbstate" value="1" />
			确认调入
			<br />
			<input type="submit" value="创建" />
		</form>

	</body>
</html>
