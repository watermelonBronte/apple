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
    <title>My JSP 'update_return.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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

<style>
tr{height:39px;}

font{text-shadow:#ccc 1px 1px 1px; }
</style>
  </head>
  
  <body><!--
   <h1><s:text name="修改领用归还信息"></s:text></h1>
  --><form action="updateRerutn.action" method="post">
  
<!--<table>
<tr><td>归还人id：</td><td> <input type="text" value="${userByRuid.uid}" name="userByRuid.uid" /></td></tr>

<tr><td>归还时间 ：</td><td> <input type="text" value="${arrdate}" name="arrdate" /></td></tr>

<tr><td> <input type="submit" value="提交"/></td><td> <input type="reset" value="重置"/></td></tr>

</table>







--><table cellSpacing="0"  cellPadding="4" width="62%" align="center"  border="1" bordercolor="#CCD3DD" style="border-collapse:collapse;">
				<tr  >
					<td colSpan="2"  style="font-size:20px; font-weight:bold;background-color:#7A8DA7">
						<div align="center" > <font color="#fff" >确认归还信息</font></div>
					</td>
				</tr>
				<tr style="display:none"><td>领用归还id：</td><td><input type="text"  value="${arid}" name=arid readonly="readonly" /></td></tr>
<tr style="display:none"><td >资产id：</td><td><input type="text" value='${asset.aid}' name="asset.aid" style="display:none"/></td></tr>
<tr style="display:none"><td> 领用人id：</td><td>  <input type="text"  value="${userByGuid.uid}"  name="userByGuid.uid" style="display:none"/></td></tr>
		<tr style="display:none"><td> 状态：</td><td> <input type="text" value="1" name="arstate" />  </td></tr>		
			<tr style="display:none"><td>领用时间：</td><td> <input type="text" value="${argdate}" name="argdate" style="display:none"/></td></tr>	
				<tr>
                    <td noWrap  style=" background-color:#F4F4F4"><FONT face='宋体' >	归还人:</FONT></td>
                    <td width='79%'>
                        	${loginUname}
                         </td></tr>
<tr>
 <td noWrap class="style2" style=" background-color:#F4F4F4"><FONT face='宋体' >	归还时间:</FONT></td>
                    <td width='79%'>
                       <input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker"  name="arrdate" />

                         </td>

</tr>


                
                        
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
