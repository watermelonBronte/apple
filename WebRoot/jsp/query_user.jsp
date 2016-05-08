<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    
    <title>My JSP 'queryUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<script>

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

</script>
  </head>
  
  <body>
   <h1>用户信息</h1>
   <form action="" id="_form" method="post"><!--alert(parseInt(userinfor.value)) -->
  根据用户id查询：<input id="userinfor" type="text"  value="" name="user.uid" />
  <a href="selectUserId.action?id=3"> 查询</a>
   <table style="border:1px solid black">
   <tr >
   		<th>
   		用户ID
   		</th>
   	<th>
   		角色ID
   		</th>
   			<th>
   		部门ID
   		</th>
   			<th>
   		用户名
   		</th>
   			<th>
   		密码
   		</th>
   		
   			<th>
   		性别
   		</th>
   			<th>
   		用户状态
   		</th>
   			<th>
   		修改
   		</th>
   			<th>
   		删除
   		</th>
   </tr>
<s:iterator id="userinfo" value="pageInfo.result" status="st">
					 <tr>
       <td>${userinfo.uid}</td>   
         <td>${userinfo.role.rid}</td>  
         <td>${userinfo.department.did}</td>  
       <td>${userinfo.uname}</td>  
      <td>${userinfo.upwd}</td> 
      <td>${userinfo.usex}</td>  
      <td>${userinfo.ustate}</td>  
      <td><a href="selectUserById.action?uid=${userinfo.uid}">更新</a></td>
       <td><a href="deleteUser.action?uid=${userinfo.uid}">删除</a></td>
       </tr>
				</s:iterator>

 <tr>
					<td align="center" class="left_txt" colspan="11">
						<div style="float: right;">
							<input type="hidden" id="pageInfo.currentPage"
								name="pageInfo.currentPage" value="${pageInfo.currentPage}" />
							共${pageInfo.pages }页(${pageInfo.rows }条记录 )&nbsp; 当前第
							<label>
								${pageInfo.currentPage }
							</label>
							页&nbsp;
							<font color=#808080><a
								href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.firstPage }')">第一页</a>
							</font>&nbsp;
							<font color=#808080><a
								href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.prevPage }')">上一页</a>
							</font>&nbsp;
							<font color=#808080><a
								href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.nextPage }')">下一页</a>
							</font>&nbsp;
							<font color=#808080><a
								href="javascript:goto('pageInfo.currentPage','_form','${pageInfo.lastPage }')">最后一页</a>
							</font>
						</div>
					</td>
				</tr>
   </table>
   </form>
   <br/>
   <a href="jsp/create_user.jsp">添加用户</a>
  </body>
</html>
