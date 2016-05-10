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
			<input type="text" name="userByCuid.uid" value="${userByCuid.uid}"/>
			<br />
			审核时间
			<!-- 时间控件 -->
			<!--<input type="text" name="scdate" value="${scdate}" readonly="readonly" />-->
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
