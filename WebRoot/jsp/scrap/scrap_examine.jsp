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
		<meta http-equiv="description" content="This is my page"><!--
		<link href='http://fonts.useso.com/css?family=Open+Sans:400,700'
			rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

		--><script
			src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js"
			type="text/javascript"></script><!--

		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/theme.css">
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/premium.css">
		
		--><script type="text/javascript"
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

<style>
tr{height:39px;}

font{text-shadow:#ccc 1px 1px 1px; }
</style>
	</head>

	<body>
		<form action="scrap/scrap_Scrap_examinScrap.action" method="post"><!--

			报废ID
			<input type="text" name="scid" value="${scid}" readonly="readonly" />
			<br />

			资产ID
			<input type="text" name="asset.aid" value="${asset.aid}"
				readonly="readonly" />
			<br />
			报废人
			<input type="text" name="userByUid.uname" value="${userByUid.uname}"
				readonly="readonly" />
			<br />
			报废部门
			<input type="text" name="userByUid.department.dname"
				value="${userByUid.department.dname}" readonly="readonly" />
			<br />
			报废时间
			<input type="text" name="scdate" value="${scdate}"
				readonly="readonly" />
			<br />
			<hr />
			审核人ID
			<input type="text" name="userByCuid.uid" value="${userByCuid.uid}"/>
			<s:select list="userList" listKey="uid" listValue="uname"
				name="userByCuid.uid" />
			
			${loginUname}
			<br />
			审核时间
			 时间控件 
			<input type="text" name="scdate" value="${scdate}" readonly="readonly" />
			<input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${cdate}" name="cdate" />

			<br />
			状态

			<input type="radio" name="scstate" value="0" />
			报废
			<input type="radio" name="scstate" value="1" checked="checked" />
			维修

			<br />


			<input type="submit" value="确定" />
			
			
			
			
			
	
			
			--><table cellSpacing="0"  cellPadding="4" width="62%" align="center"  border="1" bordercolor="#CCD3DD" style="border-collapse:collapse;">
				<tr  >
					<td colSpan="2"  style="font-size:20px; font-weight:bold;background-color:#7A8DA7">
						<div align="center" > <font color="#fff" >审核</font></div>
					</td>
				</tr>
				<tr style="display:none"><td>报废ID
			<input type="text" name="scid" value="${scid}" readonly="readonly" />
			<br />

			资产ID
			<input type="text" name="asset.aid" value="${asset.aid}"
				readonly="readonly" />
			<br />
			报废人
			<input type="text" name="userByUid.uname" value="${userByUid.uname}"
				readonly="readonly" />
			<br />
			报废部门
			<input type="text" name="userByUid.department.dname"
				value="${userByUid.department.dname}" readonly="readonly" />
			<br />
			报废时间
			<input type="text" name="scdate" value="${scdate}"
				readonly="readonly" /></td></tr>
				
				
				<tr>
                    <td noWrap  style=" background-color:#F4F4F4"><FONT face='宋体' >	审核人:</FONT></td>
                    <td width='79%'>
                        	${loginUname}
                         </td></tr>
<tr>
 <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >	审核时间:</FONT></td>
                    <td width='79%'>
                       <input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker"  name="cdate" />

                         </td>

</tr>


                        <tr>
                        <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >状态:</FONT></td>
                        <td width='79%'>
                        	<input type="radio" name="scstate" value="0" />
			报废
			<input type="radio" name="scstate" value="1" checked="checked" />
			维修
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
