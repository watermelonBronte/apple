<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'roleQuery.jsp' starting page</title>
    
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
  
    <form action="" id="_form" method="post">
   <table style="border:1px solid black">
   <tr >
   		<th>
   		角色ID
   		</th>
   			<th>
   		角色名称
   		</th>
   			<th>
   	修改
   		</th>
   			<th>
   		删除
   		</th>	
   </tr>
   
   
   
   <s:iterator id="roleinfo" value="pageInfo.result" status="st">
					 <tr>
       <td>${roleinfo.rid}</td>
         <td>${roleinfo.rname}</td>
         
      <td><a href="selectRoleById.action?rid=${roleinfo.rid}">更新</a></td>
       <td><a href="deleteRole.action?rid=${roleinfo.rid}">删除</a></td>
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
				<!--
   </table>
   </form>
   <br/>
   <a href="jsp/create_user.jsp">添加用户</a>
    
      --><!--<c:forEach items="${roleList}" var="roleinfo">
   <tr>
       <td>${roleinfo.rid}</td>
       <td>${roleinfo.rname}</td>
      <td><a href="jsp/update_role.jsp?id=${roleinfo.rid}">更新</a></td>
       <td><a href="deleteRole.action?id=${roleinfo.rid}">删除</a></td>
</c:forEach>
   --><!-- 
   <s:iterator value="#request.roleList" id="roleinfo">
    <tr height="50px">
    
   		<td>
   		<s:property value="roleinfo.rid"/>
   		</td>
   <td>
   		<s:property value="roleinfo.rname"/>
   		</td>
   		
   		<td><a href="deleteRole.action?id=<s:property value='#roleinfo.rid'/>">删除</a></td>
   <td><a href="updateRole.jsp?id=<s:property value='##roleinfo.rid'/>">更新</a></td>
   </tr> -->

 <!--  </s:iterator> --> 
   </table>
     </form>
   <br/>
   <a href="jsp/role/create_role.jsp">添加角色</a>
  </body>
</html>
