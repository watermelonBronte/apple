<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUser.jsp' starting page</title>
    
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
  <h1><s:text name="修改用户信息"></s:text></h1>
  <form action="updateUser.action" method="post">
  
<table><tr><td>用户ID：</td><td><input type="text"  value="${uid}" name="uid" readonly="readonly"/></td></tr>
<tr><td>角色ID：</td><td><input type="text" value='${role.rid}' name="role.rid" /></td></tr>
<tr><td> 部门ID：</td><td>  <input type="text"  value="${department.did}"  name="department.did" /></td></tr>
<tr><td>用户名：</td><td> <input type="text" value="${uname}" name="uname" /></td></tr>
<tr><td> 密码：</td><td> <input type="password" value="${upwd}" name="upwd" /></td></tr>
<tr><td>  性别 ：</td><td> <input type="text" value="${usex}" name="usex" /></td></tr>
<tr><td> 用户状态：</td><td> <input type="text" value="${ustate}" name="ustate" />  </td></tr>
<tr><td> <input type="submit" value="提交"/></td><td> <input type="reset" value="重置"/></td></tr>

</table>

</form>
  </body>
</html>
