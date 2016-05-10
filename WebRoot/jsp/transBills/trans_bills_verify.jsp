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
		<form action="transBills/transBills_TransBills_verifyTransBills.action" method="post">
			调拨ID
			<input type="text" name="tbid" value="${tbid}" readonly="readonly" />
			<br />
			资产ID
			<input type="text" name="asset.aid" value="${asset.aid}"
				readonly="readonly" />
			<br />
			调出人ID
			<input type="text" name="userByOutuid.uname"
				value="${userByOutuid.uname}" readonly="readonly" />
			<br />
			调出人部门
			<input type="text" name="userByOutuid.department.dname"
				value="${userByOutuid.department.dname}" readonly="readonly" />
			<br />
			调出时间
			<input type="text" name="outdate" value="${outdate}"
				readonly="readonly" />
			<br />
			调出事由
			<input type="text" name="outname" value="${outname}"
				readonly="readonly" />
			<br />
			调入人ID
			<input type="text" name="userByInuid.uid" />
			<br />
			调入时间
			<!--<input type="text" name="outdate" value="123" />-->
			<br />
			状态
			<s:if test="tbstate==0">
				<input type="radio" name="tbstate" value="0" checked="checked" />
			调拨中
			<input type="radio" name="tbstate" value="1" />
			确认调入
			</s:if>
			<s:else>
				<input type="radio" name="tbstate" value="0" />
			调拨中
			<input type="radio" name="tbstate" value="1" checked="checked" />
			确认调入
			</s:else>
			<br />
			<input type="submit" value="更新" />
		</form>


	</body>
</html>
