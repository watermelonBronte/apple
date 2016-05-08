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
		资产ID
		<input type="text" name="aid" value="${aid}" readonly="readonly" />
		<br />
		卡片编号
		<input type="text" name="cid" value="${cid}" />
		<br />
		资产类别名称
		<input type="text" name="assetCategory.acname"
			value="${assetCategory.acname}" />
		<br />
		上级资产类别名称
		<input type="text" name="assetCategory.supacname"
			value="${assetCategory.supacname}" />
		<br />
		使用人名称
		<input type="text" name="user.uname" value="${user.uname}" />
		<br />
		入库状态
		<s:if test="astate==0">
		<input type="text" name="astate" value="库存" />
		</s:if>
		<s:elseif test="astate==1">
		<input type="text" name="astate" value="在用" />
		</s:elseif>
		<s:elseif test="astate==2">
		<input type="text" name="astate" value="故障" />
		</s:elseif>
		<s:elseif test="astate==3">
		<input type="text" name="astate" value="报废" />
		</s:elseif>
		<s:else>
		<input type="text" name="astate" value="删除" />
		</s:else>
		<br />
		入库时间
		<input type="text" name="adate" value="${adate}" />
		<br />
		是否打印标签
		<s:if test="tprint==1">
			<input type="radio" name="tprint" value="1" checked="checked" />
			是
			<input type="radio" name="tprint" value="2" />
			否
			</s:if>
		<s:else>
			<input type="radio" name="tprint" value="1" />
			是
			<input type="radio" name="tprint" value="2" checked="checked" />
			否
			</s:else>
		<br />
		一维码路径
		<input type="text" name="onepath" value="${onepath}" />
		<br />
		二维码路径
		<input type="text" name="twopath" value="${twopath}" />
		<br />
		条码
		<input type="text" name="barcode" value="${barcode}" />
		<br />
		备注
		<input type="text" name="anote" value="${anote}" />
		<br />
		<hr />
		<h3>
			财务入账单
		</h3>
		财务编码
		<input type="text" name="finance.fcode" value="${finance.fcode}" />
		<br />
		财务入账人名称
		<input type="text" name="finance.user.uname"
			value="${finance.user.uname}" />
		<br />
		是否财务入账
		<s:if test="finance.fenter==1">
			<input type="radio" name="finance.fenter" value="1" checked="checked" />
			是
			<input type="radio" name="finance.fenter" value="2" />
			否
		</s:if>
		<s:else>
			<input type="radio" name="finance.fenter" value="1" />
			是
			<input type="radio" name="finance.fenter" value="2" checked="checked" />
			否
		</s:else>
		<br />
		财务入账时间
		<input type="text" name="finance.fdate" value="${finance.fdate}" />
		<br />
		<hr />
		<h3>
			采购单
		</h3>
		采购部门
		<input type="text" name="purchaseNote.department.did"
			value="${purchaseNote.department.did}" />
		<br />
		采购人名称
		<input type="text" name="purchaseNote.user.uname"
			value="${purchaseNote.user.uname}" />
		<br />
		采购时间
		<input type="text" name="purchaseNote.pndate"
			value="${purchaseNote.pndate}" />
		<br />
		采购用途
		<input type="text" name="purchaseNote.pnuse"
			value="${purchaseNote.pnuse}" />
		<br />
		采购状态
		<input type="text" name="purchaseNote.pnstate"
			value="${purchaseNote.pnstate}" />
		<br />
		<a href="asset/asset_Asset_findAssetById.action?aid=${aid}">详情</a>
							
		<!--<input type="submit" value="更新" />
		</form>

 
	-->
	</body>
</html>
