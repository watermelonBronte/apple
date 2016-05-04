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
		<h1>
			创建资产
		</h1>
		<form action="asset/asset_Asset_createAsset.action" method="post"><!--
			资产类别
			--><!--<select name="AssetCategory">
				<option value="--请选择--"></option>
				<s:iterator id="ac" value="assetCategoryList" status="st">
					<option value="${ac.acname}">
						${ac.accode }
					</option>
				</s:iterator>
			</select>
			-->
			卡片编号
			<input type="text" name="cid" value="1" />
			<br />
			资产类别ID
			<input type="text" name="acid" value="1" />
			<br />
			使用人ID
			<input type="text" name="useuid" value="1" />
			<br />
			使用状态
			<input type="checkbox" value="1" checked="checked" name="usestate"/>在用
			<input type="checkbox" value="2" name="usestate"/>不在用
			<br />
			保管人ID
			<input type="text" name="uid" value="1" />
			<br />
			财务入账人ID
			<input type="text" name="fuid" value="1" />
			<br />
			保管人ID
			<input type="text" name="uid" value="1" />
			<br />
			财务入账人ID
			<input type="text" name="fuid" value="1" />
			<br />
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
