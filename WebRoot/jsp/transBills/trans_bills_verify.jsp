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
		<title>调入确认</title>
		<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	
		<script
			src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js"
			type="text/javascript"></script>

		
		<script type="text/javascript"
			src="http://www.js-css.cn/jscode/jquery.min.js"></script>

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
		<h3>
			调入确认
		</h3>
		<form
			action="transBills/transBills_TransBills_verifyTransBills.action"
			method="post"><!--
			调拨ID
			<input type="text" name="tbid" value="${tbid}" readonly="readonly" />
			<br />
			资产ID
			<input type="text" name="asset.aid" value="${asset.aid}"
				readonly="readonly" />
			<br />
			调出人
			<input type="text" name="userByOutuid.uname"
				value="${userByOutuid.uname}" readonly="readonly" />
			<br />
			调出人部门
			<input type="text" name="userByOutuid.department.dname"
				value="${userByOutuid.department.dname}" readonly="readonly" />
			<br />
			调出时间
			<input type="text" name="outdate" value="${outdate}"
				readonly="readonly" />
			<br />
			调出事由
			<input type="text" name="outname" value="${outname}"
				readonly="readonly" />
			<br />
			调入人
			<input type="text" name="userByInuid.uid" />
			
			<s:select list="userList" listKey="uid" listValue="uname"
				name="userByInuid.uid" />
				
			${loginUname}
			<br />
			调入时间
			<input type="text" name="outdate" value="123" />
			<input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${indate}" name="indate" />

			<br />
			状态

			<input type="radio" name="tbstate" value="0" />
			调拨中
			<input type="radio" name="tbstate" value="1" checked="checked" />
			确认调入

			<br />
			<input type="submit" value="更新" />
		-->
		
		<table cellSpacing="0"  cellPadding="4" width="62%" align="center"  border="1" bordercolor="#CCD3DD" style="border-collapse:collapse;">
				<tr  >
					<td colSpan="2"  style="font-size:20px; font-weight:bold;background-color:#7A8DA7">
						<div align="center" > <font color="#fff" >确认调入</font></div>
					</td>
				</tr>
				<tr style="display:none"><td>调拨ID
			<input type="text" name="tbid" value="${tbid}" readonly="readonly" />
			<br />
			资产ID
			<input type="text" name="asset.aid" value="${asset.aid}"
				readonly="readonly" />
			<br />
			调出人
			<input type="text" name="userByOutuid.uname"
				value="${userByOutuid.uname}" readonly="readonly" />
			<br /><!--
			调出人部门
			<input type="text" name="userByOutuid.department.dname"
				value="${userByOutuid.department.dname}" readonly="readonly" />
			<br />-->
			调出时间
			<input type="text" name="outdate" value="${outdate}"
				readonly="readonly" />
			<br />
			调出事由
			<input type="text" name="outname" value="${outname}"
				readonly="readonly" /></td></tr>
				
				
				<tr>
                    <td noWrap  style=" background-color:#F4F4F4"><FONT face='宋体' >	调入人:</FONT></td>
                    <td width='79%'>
                        	${loginUname}
                         </td></tr>
<tr>
 <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >	调入时间:</FONT></td>
                    <td width='79%'>
                       <input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker"  name="indate" />

                         </td>

</tr>


                        <tr>
                        <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >状态:</FONT></td>
                        <td width='79%'>
                        	<input type="radio" name="tbstate" value="0" />
			调拨中
			<input type="radio" name="tbstate" value="1" checked="checked" />
			确认调入
                        </td></tr>
                        
                        
                        <tr>
					<td noWrap height="25" class="style2">
						<div align="right"><FONT face="宋体"></FONT>&nbsp;</div>
					</td>
					<td width="59%" height="25">&nbsp;
							<input type="submit" value="确定" />
						
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
