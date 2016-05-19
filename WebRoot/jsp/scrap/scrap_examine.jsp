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
<title>调入确认</title>
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
		<form action="scrap/scrap_Scrap_examinScrap.action" method="post">

			报废ID
			<input type="text" name="scid" value="${scid}" readonly="readonly" />
			<br />

			资产ID
			<input type="text" name="asset.aid" value="${asset.aid}"
				readonly="readonly" />
			<br />
			报废人
			<input type="text" name="userByUid.uname" value="${userByUid.uname}"
				readonly="readonly" />
			<br />
			报废部门
			<input type="text" name="userByUid.department.dname"
				value="${userByUid.department.dname}" readonly="readonly" />
			<br />
			报废时间
			<input type="text" name="scdate" value="${scdate}"	readonly="readonly" />
			<br />
			<hr />
			审核人ID
			<!--<input type="text" name="userByCuid.uid" value="${userByCuid.uid}"/>-->
			<s:select list="userList" listKey="uid" listValue="uname"
				name="userByCuid.uid" />
			<br />
			审核时间
			<!-- 时间控件 -->
			<!--<input type="text" name="scdate" value="${scdate}" readonly="readonly" />-->
			<input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${cdate}" name="cdate" />
			
			<br />
			状态
			<s:if test="scstate==0">
				<input type="radio" name="scstate" value="0" checked="checked" />
			报废
			<input type="radio" name="scstate" value="1" />
			维修
			</s:if>
			<s:else>
				<input type="radio" name="scstate" value="0" />
			报废
			<input type="radio" name="scstate" value="1" checked="checked" />
			维修
			</s:else>
			<br />


			<input type="submit" value="确定" />
		</form>


	</body>
</html>
