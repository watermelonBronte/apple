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
		<title>添加资产</title>
		<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700'
			rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

		--><script
			src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js"
			type="text/javascript"></script>

		<!--<link rel="stylesheet" type="text/css"
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
		-->
		
		
		
	<script type="text/javascript" src="http://www.js-css.cn/jscode/jquery.min.js"></script>
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

		<h1>
			创建资产
		</h1>
		<form action="asset/asset_Asset_createAsset.action" method="post">
		<table>
		<tr> <td>卡片编号 </td> <td><input type="text" name="cid" value="1" /> </td></tr>
		<tr> <td>资产类别名称 </td> <td> <s:select list="assetCategoryList" listKey="acid" listValue="acname"
				name="assetCategory.acid" /></td></tr>
		<tr> <td>使用人名称 </td> <td><s:select list="userList" listKey="uid" listValue="uname"
				name="user.uid" /> </td></tr>
		<tr> <td>财务入账单编号 </td> <td> <s:select list="financeList" listKey="fid" listValue="fcode"
				name="finance.fid" /></td></tr>
		<tr> <td>入库时间 </td> <td>
		<input  style="width:240px;background: #fefefe;border: 1px solid #bbb;font-size: 14px;color: #333;padding: 7px;border-radius: 3px;" type="text" class="date_picker" value="${adate}" name="adate" /><!--
		
		
		 <input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${adate}" name="adate" /></td>--></tr>
		<tr> <td>入库状态 </td> <td><input type="radio" name="astate" value="0" checked="checked" />
			库存
			<input type="radio" name="astate" value="1" />
			在用
			<input type="radio" name="astate" value="2" />
			故障
			<input type="radio" name="astate" value="3" />
			报废
			<input type="radio" name="astate" value="-1" />
			删除 </td></tr>
			<tr> <td>资产名称 </td> <td> <s:select list="purchaseDetailList" listKey="pdid" listValue="aname"
				name="purchaseDetail.pdid" /></td></tr>
				<tr> <td>是否打印标签 </td> <td><input type="radio" name="tprint" value="1" />
			是
			<input type="radio" name="tprint" value="2" checked="checked" />
			否 </td></tr>
				<tr> <td>一维码地址 </td> <td> <input type="text" name="onepath" value="1" /></td></tr>
				<tr> <td>二维码地址 </td> <td><input type="text" name="twopath" value="1" /> </td></tr>	
				<tr> <td>条码 </td> <td> 	<input type="text" name="barcode" value="1" /></td></tr>	
				<tr> <td>备注 </td> <td><input type="text" name="anote" value="1" /> </td></tr>	
			
		<tr>	<td><input type="submit" value="创建" /></td></tr>
			
			<!--<input type="text" name="assetCategory.acid" value="1" />-->
			
		
			
			<!--<input type="text" name="user.uid" value="1" />-->
			
		
			
			<!--<input type="text" name="finance.fid" value="1" />-->
			
			
			
			<!--<input type="text" name="adate" value="1" />-->
			
		
			
			
		
			
			<!--<input type="text" name="purchaseDetail.pdid" value="1" />-->
			
		
		
			
		
			
			
			
			
			
		
			
		
		
			
			
			
		
			</table>
		</form>
	</body>
</html>
