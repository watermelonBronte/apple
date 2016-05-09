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
    <title>My JSP 'query_return.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script>

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
       <h1>采购单信息</h1>
    <form action="" id="_form" method="post">
   <table style="border:1px solid black">
   <tr >
   		<th>
   	领用归还id
   		</th>
   			<th>
   	资产id
   		</th>
   			<th>
   	领用人id
   		</th>
   		<th>
   	归还人id
   		</th>
   		<th>
   	领用时间
   		</th>
   		<th>
   	归还时间
   		</th>
   			<th>
   	状态
   		</th>
   		<th>
   	修改
   		</th>
   		
   	
   			<th>
   		删除
   		</th>	
   </tr>
   
   
   
   <s:iterator id="reinfo" value="pageInfo.result" status="st">
					 <tr>
       <td>${reinfo.arid}</td>
         <td>${reinfo.asset.aid}</td>
          <td>${reinfo.userByGuid.uid}</td>
         <td>${reinfo.userByRuid.uid}</td>
          <td>${reinfo.argdate}</td>
         <td>${reinfo.arrdate}</td>
          <td>${reinfo.arstate}</td>
      
      <td><a href="selectReturnById.action?arid=${reinfo.arid}">更新</a></td>
       <td><a href="deleteReturn.action?arid=${reinfo.arid}">删除</a></td>
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
   <a href="jsp/return/create_return.jsp">添加采购单</a>
  </body>
</html>
