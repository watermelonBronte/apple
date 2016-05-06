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
		<form action="finance/finance_Finance_updateFinance.action"
			method="post">

			资产入账ID
			<input type="text" name="fid" value="${fid}" readonly="readonly" />
			<br />
			资产入账编号
			<input type="text" name="fcode" value="${fcode}" />
			<br />
			资产入账人ID
			<input type="text" name="user.uid" value="${user.uid}" />
			<br />
			资产是否入账
			<input type="text" name="fenter" value="${fenter}" />
			<br />
			<input type="submit" value="更新" />
		</form>


	</body>
</html>
