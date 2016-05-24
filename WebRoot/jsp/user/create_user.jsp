<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'createUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body>
   <form action="createUser.action" method="post">
   用户名<input type="text" name="user.uname" />
  用户密码<input type="password" name="user.upwd"/>
  性别 <input type="text" name="user.usex" />
  角色id <input type="text" name="user.role.rid"/>
   部门id<input type="text" name="user.department.did"  />
   状态 <input type="text" name="user.ustate" />
  
  <input type="submit"  value="提交"/>
   
   </form>
   
   
   
   

   
  </body>
</html>
