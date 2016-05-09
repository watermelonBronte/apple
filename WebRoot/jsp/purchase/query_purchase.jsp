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
    <title>My JSP 'query_purchase.jsp' starting page</title>
    
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
   		采购单id
   		</th>
   			<th>
   		采购部门id
   		</th>
   			<th>
   	采购单明细id
   		</th>
   		<th>
   	经办人
   		</th>
   		<th>
   	采购日期
   		</th>
   		<th>
   	采购用途
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
   
   
   
   <s:iterator id="purinfo" value="pageInfo.result" status="st">
					 <tr>
       <td>${purinfo.pnid}</td>
         <td>${purinfo.department.did}</td>
          <td>${purinfo.purchaseDetail.pdid}</td>
         <td>${purinfo.user.uid}</td>
          <td>${purinfo.pndate}</td>
         <td>${purinfo.pnuse}</td>
          <td>${purinfo.pnstate}</td>
      
      <td><a href="selectPurchaseById.action?pnid=${purinfo.pnid}">更新</a></td>
       <td><a href="deletePurchase.action?pnid=${purinfo.pnid}">删除</a></td>
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
   <a href="jsp/purchase/create_purchase.jsp">添加采购单</a>
  </body>
</html>
