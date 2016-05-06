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
		<!--<form action="asset_category/test_AssetCategory_updateAssetCategory.action"
			method="post">
			
			
			-->
			资产ID<input type="text" name="aid" value="${aid}" readonly="readonly"/>
			<br />
			卡片编号
			<input type="text" name="cid" value="${cid}"/>
			<br />
			资产类别名称
			<input type="text" name="assetCategory.acname" value="${assetCategory.acname}"/>
			<br />
			使用人名称
			<input type="text" name="user.uid" value="${user.uid}"/>
			<br />
			使用状态
			<input type="text" name="usestate" value="${usestate}"/>
			<br /><!--
			财务编码
			制造商
			供应商
			数量
			单位
			单价
				
			--><!--<input type="submit" value="更新" />
		</form>


	--></body>
</html>
