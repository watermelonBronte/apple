<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
	<h3>维修单详情</h3>
		资产维修ID
		<input type="text" name="reid" value="${reid}" readonly="readonly" />
		<br />
		资产ID
		<input type="text" name="asset.aid"  value="${asset.aid}"  readonly="readonly" />
		<br />
		送修人名称
		<input type="text" name="user.uname"  value="${user.uname}" readonly="readonly" />
		<br />
		送修部门
		<input type="text" name="user.department.dname"  value="${user.department.dname}" readonly="readonly" />
		<br />
		损坏情况
		<input type="text" name="recondition"  value="${recondition}" readonly="readonly" />
		<br />
		维修费用
		<input type="text" name="reprice"  value="${reprice}"  readonly="readonly" />
		￥
		<br />
		状态
		<!--0-维修中 1-维修完成-->
		<s:if test="restate==0">
		<input type="radio" name="restate" value="0" checked="checked" />
		维修中
		<input type="radio" name="restate" value="1" />
		维修完成
		</s:if>
		<s:else>
		<input type="radio" name="restate" value="0"/>
		维修中
		<input type="radio" name="restate" value="1" checked="checked" />
		维修完成
		</s:else>
		<br />

	
		<a href="repairs/repairs_Repairs_pageRepairs.action">返回</a>
	</body>
</html>
