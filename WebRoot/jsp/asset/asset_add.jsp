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
		<form action="asset/asset_Asset_createAsset.action" method="post">
			卡片编号
			<input type="text" name="cid" value="1" />
			<br />
			资产类别ID
			<input type="text" name="acid" value="1" />
			<br />
			使用人ID
			<input type="text" name="useuid" value="1" />
			<br />
			财务入账单ID
			<input type="text" name="fid" value="1" />
			<br />
			入库时间
			<input type="text" name="adate" value="1" />
			<br />
			入库状态
			<input type="radio" name="astate" value="1" />
			是
			<input type="radio" name="astate" value="2" checked="checked" />
			否
			<br />
			采购单ID
			<input type="text" name="pnid" value="1" />
			<br />
			是否打印标签
			<input type="radio" name="tprint" value="1" />
			是
			<input type="radio" name="tprint" value="2" checked="checked" />
			否
			<br />
			一维码地址
			<input type="text" name="onepath" value="1" />
			<br />
			二维码地址
			<input type="text" name="twopath" value="1" />
			<br />
			条码
			<input type="text" name="barcode" value="1" />
			<br />
			备注
			<input type="text" name="anote" value="1" />
			<br />
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
