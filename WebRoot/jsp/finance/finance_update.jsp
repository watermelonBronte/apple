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
<script type="text/javascript" src="http://www.js-css.cn/jscode/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.date_input.pack.js"></script> 
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/calendar.css">
  
  <script type="text/javascript">
$(function(){
	$('.date_picker').date_input();
	})
	</script>


	</head>

	<body>
		<form action="finance/finance_Finance_updateFinance.action"
			method="post">

			资产入账ID
			<input type="text" name="fid" value="${fid}" readonly="readonly" />
			<br />
			资产入账编号
			<input type="text" name="fcode" value="${fcode}" />
			<br />
			资产入账人ID
			<input type="text" name="user.uid" value="${user.uid}" />
			<br />
			资产是否入账
			<!--<input type="text" name="fenter" value="${fenter}" />-->
			<s:if test="fenter==1">
			<input type="radio" name="fenter" value="1" checked="checked"/>
			是
			<input type="radio" name="fenter" value="2"/>
			否
			</s:if>
			<s:else>
			<input type="radio" name="fenter" value="1"/>
			是
			<input type="radio" name="fenter" value="2" checked="checked"/>
			否
			</s:else>
			<br />
			财务入账
			<input  style="width:240px;background: #fefefe;border: 1px solid #bbb;font-size: 14px;color: #333;padding: 7px;border-radius: 3px;" type="text" class="date_picker" value="${sdate}" name="fdate" />
			<br />
			<input type="submit" value="更新" />
		</form>


	</body>
</html>
