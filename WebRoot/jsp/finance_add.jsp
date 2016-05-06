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
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #F8F9FA;
}
-->
</style>

		<!--<link href="images/skin.css" rel="stylesheet" type="text/css" />-->
		<script>

//翻页  pageNo:隐藏域控件名  formName：要提交的表单名 pageno:页码
function goto(pageNo,formName,pageno){
	document.getElementById(pageNo).value=pageno;
	submitFrom(formName);
}

//提交form
function submitFrom(formName){
	var _form=document.getElementById(formName);
	_form.submit();
}

</script>



	</head>

	<body>
		
	
<h1>创建财务入账</h1>
		<form action="finance/finance_Finance_createFinance.action"
			method="post">
			财务入账编码
			<input type="text" name="fcode" value="123"/>
			<br />
			财务入账人ID
			<input type="text" name="user.uid" value="123"/>
			<br />
			财务是否入账
			<input type="text" name="fenter" value="123"/>
			<br />
			<input type="submit" value="创建" />
		</form>

	</body>
</html>
