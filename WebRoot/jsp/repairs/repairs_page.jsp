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
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #F8F9FA;
}
-->
</style>

		<!--<link href="images/skin.css" rel="stylesheet" type="text/css" />-->
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
		
		<h1>
			维修单列表
		</h1>
		<!--<a href="finance/finance_Finance_addFinance.action">添加记录</a>-->

		<form action="" id="_form" method="post">
			<table width="100%" border="1" cellpadding="0"
				style="margin-top: 5px;" cellspacing="0">
				<tr class="datalist_head">
					<td class="left_bt2" align="center" width="10%">
						资产维修ID
					</td>
					<td class="left_bt2" align="center" width="10%">
						资产ID
					</td>
					<td class="left_bt2" align="center" width="10%">
						送修人名字
					</td>
					<td class="left_bt2" align="center" width="10%">
						维修费用
					</td>
					<td class="left_bt2" align="center" width="10%">
						状态
					</td>
					<td class="left_bt2" align="center" width="10%">
						操作
					</td>
				</tr>

				<s:iterator id="re" value="pageInfo.result" status="st">
					<tr align=center>
						<td align="center" class="left_txt">
							${re.reid}
						</td>
						<td align="center" class="left_txt">
							${re.asset.aid}
						</td>
						<td align="center" class="left_txt">
							${re.user.uname}
						</td>
						<td align="center" class="left_txt">
							${re.reprice}
						</td>
						<td align="center" class="left_txt">
							<s:if test="%{#re.restate==0}">维修中</s:if>
							<s:else>维修完成</s:else>
						</td>
						<td align="center" class="left_txt">
							<a
								href="repairs/repairs_Repairs_findRepairsById.action?reid=${reid}">详情</a>
							|
							<a
								href="repairs/repairs_Repairs_deleteRepairs.action?reid=${reid}">删除</a>
							|
							<a href="repairs/repairs_Repairs_updateState.action?reid=${reid}">维修完成</a>

						</td>
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
		<hr />
		<h1>
			填写维修单
		</h1>
		<form action="repairs/repairs_Repairs_createRepairs.action"
			method="post">
			资产ID
			<input type="text" name="asset.aid" value="1" />
			<br />
			送修人ID
			<input type="text" name="user.uid" value="1" />
			<br />
			损坏情况
			<input type="text" name="recondition" value="非常严重" />
			<br />
			维修费用
			<input type="text" name="reprice" value="100" />
			￥
			<br />
			状态
			<!--0-维修中 1-维修完成-->
			<input type="radio" name="restate" value="0" checked="checked" />
			维修中
			<input type="radio" name="restate" value="1" />
			维修完成
			<br />
			<input type="submit" value="创建" />
		</form>

	</body>
</html>
