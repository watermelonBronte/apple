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
    <title>My JSP 'update_purchase.jsp' starting page</title>
    
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
  <h1><s:text name="修改采购信息"></s:text></h1>
  <form action="updatePurchase.action" method="post">
  
<table><tr><td>采购单id：</td><td><input type="text"  value="${pnid}" name=pnid readonly="readonly"/></td></tr>
<tr><td> 经办人：</td><td>  <input type="text"  value="${purchase.user.uid}"  name="user.uid" /></td></tr>
<tr><td>采购日期：</td><td> <input type="text" value="${pndate}" name="pndate" /></td></tr>
<tr><td>采购用途：</td><td> <input type="text" value="${pnuse}" name="pnuse" /></td></tr>
<tr><td>  状态 ：</td><td> <input type="text" value="${pnstate}" name="pnstate" /></td></tr>

<tr><td> <input type="submit" value="提交"/></td><td> <input type="reset" value="重置"/></td></tr>

</table>

</form>
  </body>
</html>
