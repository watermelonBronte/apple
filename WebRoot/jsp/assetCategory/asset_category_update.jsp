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

<style>
tr{height:39px;}

font{text-shadow:#ccc 1px 1px 1px; }
</style>

	</head>

	<body>
	<form action="asset_category/test_AssetCategory_updateAssetCategory.action"
			method="post">
<table cellSpacing="0"  cellPadding="4" width="62%" align="center"  border="1" bordercolor="#CCD3DD" style="border-collapse:collapse;">
				<tr  >
					<td colSpan="2"  style="font-size:20px; font-weight:bold;background-color:#7A8DA7">
						<div align="center" > <font color="#fff" >修改资产类别列表</font></div>
					</td>
				</tr>
				<tr>
                    <td noWrap  style=" background-color:#F4F4F4"><FONT face='宋体' >	资产类别ID:</FONT></td>
                    <td width='79%'>
                        	<input type="text" name="acid" value="${assetCategory.acid}" readonly="readonly"/>
                         </td></tr>
<tr>
 <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >	资产类别编号:</FONT></td>
                    <td width='79%'>
                        <input type="text" name="accode" value="${assetCategory.accode}"/>
                         </td>
</tr>
                        <tr>
                        <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >资产类别名称:</FONT></td>
                        <td width='79%'>
                        	<input type="text" name="acname" value="${assetCategory.acname}"/>
                        </td>
                        <tr><td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >上级资产类别ID:</FONT></td><td width='79%'>
                        <input type="text" name="supacid" value="${assetCategory.supacid}"/>
                        </td></tr>                  
                        <tr><td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >上级资产类别名称:</FONT></td><td width='79%'>
  <input type="text" name="supacname" value="${assetCategory.supacname}"/>
  </td></tr>
  <tr>
					<td noWrap height="25" class="style2">
						<div align="right"><FONT face="宋体"></FONT>&nbsp;</div>
					</td>
					<td width="59%" height="25">&nbsp;
						<input type="submit" value="修改" />
						
						<FONT face="宋体">&nbsp;</FONT>
                        <input id="Reset1" type="reset" value="重置" /></td>
				</tr>
				
				<tr bgColor="#D6DCE4">
					<td colSpan="2">&nbsp;</td>
				</tr>
			</table>

	</form>

	</body>
</html>
