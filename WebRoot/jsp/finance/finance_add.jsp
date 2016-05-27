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

	<head>
		<base href="<%=basePath%>">
		<title>添加财务入账</title>
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
$(function(){
	$('.date_picker').date_input();
	})
	

//翻页  pageNo:隐藏域控件名  formName：要提交的表单名 pageno:页码
function goto(pageNo,formName,pageno){
	document.getElementById(pageNo).value=pageno;
	submitFrom(formName);
}

//提交form
function submitFrom(formName){
	var _form=document.getElementById(formName);
	_form.submit();
}
   $(function() {
            var match = document.cookie.match(new RegExp('color=([^;]+)'));
            if(match) var color = match[1];
            if(color) {
                $('body').removeClass(function (index, css) {
                    return (css.match (/\btheme-\S+/g) || []).join(' ')
                })
                $('body').addClass('theme-' + color);
            }

            $('[data-popover="true"]').popover({html: true});
            
        });

	

        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
</script>
		<style type="text/css">
#line-chart {
	height: 300px;
	width: 1000px;
	margin: 0px auto;
	margin-top: 1em;
}

th {
	text-align: center
}

.navbar-default .navbar-brand,.navbar-default .navbar-brand:hover {
	color: #fff;
}
</style>


	</head>


	<body class=" theme-blue" style="width: 985px">


		<!--<h1>
			创建财务入账
		</h1>
		--><form action="finance/finance_Finance_createFinance.action?aid=${aid}"
			method="post"><!--
			财务入账编码
			<input type="text" name="fcode" value="123" />
			<br />
			财务入账人ID
			<input type="text" name="user.uid" value="1" />
			<s:select list="userList" listKey="uid" listValue="uname"
				name="user.uid" />
			
			${loginUname}
			<br />
			财务是否入账
			<input type="text" name="fenter" value="123" />
			<input type="radio" name="fenter" value="1" />
			是
			<input type="radio" name="fenter" value="2" checked="checked" />
			否
			<br />
			财务入账时间
			<input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${fdate}" name="fdate" />
			<br />
			<input type="submit" value="创建" />
			
			
			
			
			
			
			
			
			
			--><table cellSpacing="0"  cellPadding="4" width="60%" align="center"  border="1" bordercolor="#CCD3DD" style="border-collapse:collapse;">
				<tr  >
					<td colSpan="2"  style="font-size:20px; font-weight:bold;background-color:#7A8DA7">
						<div align="center" > <font color="#fff" >创建财物入账</font></div>
					</td>
				</tr>
				
				
				<tr>
                    <td noWrap  style=" background-color:#F4F4F4"><FONT face='宋体' >	财务入账编码:</FONT></td>
                    <td width='79%'>
                        		<input type="text" name="fcode" value="123" />
                         </td></tr>
                         
                         <tr>
                    <td noWrap  style=" background-color:#F4F4F4"><FONT face='宋体' >	财务入账人ID:</FONT></td>
                    <td width='79%'>
                        			${loginUname}
                         </td></tr>
                         
<tr>
 <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >财务入账时间:</FONT></td>
                    <td width='79%'>
                       <input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker"  name="fdate" />

                         </td>

</tr>


                        <tr>
                        <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >财务是否入账:</FONT></td>
                        <td width='79%'>
                        	<input type="radio" name="fenter" value="1" />
			是
			<input type="radio" name="fenter" value="2" checked="checked" />
			否
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
