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
    <title>My JSP 'create_purchase.jsp' starting page</title>
    
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
    <form action="createPurchase.action" method="post">
采购单明细id：<input type="text" name="purchase.purchaseDetail.pdid" />
经办人：<input type="text" name="purchase.user.uid"  />
采购日期：<input type="text" name="purchase.pndate"  />
状态：<input type="text" name="purchase.pnstate"  />
采购用途：<input type="text" name="purchase.pnuse"  /> 

  
  <input type="submit" value="提交"/ >
   
   </form>
  </body>
</html>
