<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
       <%@ taglib uri="/struts-tags" prefix="s" %>
    <title>My JSP 'update_purdetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <!--<a href="asset_category/test_AssetCategory_home.action">主界面</a>-->
  
   <h1><s:text name="修改采购信息"></s:text></h1>
  <form action="updatePurDetail.action" method="post">
  
<table>

<tr><td>采购清单id：</td><td><input type="text"  value="${pdid}" name="pdid"  readonly="readonly"/></td></tr>

<tr><td>采购单id：</td><td><input type="text"  value="${purchaseNote.pnid}" name="purchaseNote.pnid"  readonly="readonly"/></td></tr>

<tr><td>保管人id：</td><td><input type="text"  value="${user.uid}" name="user.uid" /></td></tr>
<tr><td>资产名称</td><td><input type="text" value='${aname}' name="aname" /></td></tr>
<tr><td>资产型号</td><td><input type="text" value='${atype}' name="atype" /></td></tr>
<tr><td>数量：</td><td>  <input type="text"  value="${pdcount}"  name="pdcount" /></td></tr>
<tr><td>制造商：</td><td> <input type="text" value="${pdmarker}" name="pdmarker" /></td></tr>
<tr><td>  供应商：</td><td> <input type="text" value="${pdprovider}" name="pdprovider" /></td></tr>
<tr><td> 单位：</td><td> <input type="text" value="${pdunit}" name="pdunit" /></td></tr>
<tr><td> 单价：</td><td> <input type="text" value="${pdprice}" name="pdprice" />  </td></tr>
<tr><td> <input type="submit" value="提交"/></td><td> <input type="reset" value="重置"/></td></tr>

</table>

</form>
  </body>
</html>
