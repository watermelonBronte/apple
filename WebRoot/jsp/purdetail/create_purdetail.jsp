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
    <title>My JSP 'create_purdetail.jsp' starting page</title>
    
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
    <form action="createPurDetail.action" method="post">
保管人id：<input type="text" name="purDetail.user.uid"  />
资产型号<input type="text" name="purDetail.atype"  />
   数量：<input type="text" name="purDetail.pdcount" />
  	制造商：<input type="text" name="purDetail.pdmarker"/>  
  供应商：<input type="text" name="purDetail.pdprovider"  />
	单位：<input type="text" name="purDetail.pdunit"  />
 	单价：<input type="text" name="purDetail.pdprice"  />

  
  
  <input type="submit" value="提交"/ >
     </form>
  </body>
</html>
