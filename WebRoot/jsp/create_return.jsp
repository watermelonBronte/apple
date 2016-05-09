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
    <title>My JSP 'create_return.jsp' starting page</title>
    
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
  <h1>增加领用归还信息</h1>
  <form action="createRerutn.action" method="post">
  
<table>
<tr><td>资产id：</td><td><input type="text"  name="asset.aid" /></td></tr>
<tr><td> 领用人id：</td><td>  <input type="text"    name="userByGuid.uid" /></td></tr>
<tr><td>归还人id：</td><td> <input type="text"  name="userByRuid.uid" /></td></tr>
<tr><td>领用时间：</td><td> <input type="text" name="argdate" /></td></tr>
<tr><td>归还时间 ：</td><td> <input type="text"  name="arrdate" /></td></tr>
<tr><td> 状态：</td><td> <input type="text" name="arstate" />  </td></tr>
<tr><td> <input type="submit" value="提交"/></td><td> <input type="reset" value="重置"/></td></tr>

</table>

</form>
  </body>
</html>
