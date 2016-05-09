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
		<br />
		<a href="asset_category/test_AssetCategory_home.action">主界面</a>

		<br />
		<h1>
			财务入账列表
		</h1>
		<!--<a href="finance/finance_Finance_addFinance.action">添加记录</a>-->

		<form action="" id="_form" method="post">
			<table width="100%" border="1" cellpadding="0"
				style="margin-top: 5px;" cellspacing="0">
				<tr class="datalist_head">
					<td class="left_bt2" align="center" width="10%">
						财务入账ID
					</td>
					<td class="left_bt2" align="center" width="10%">
						财务入账编码
					</td>
					<td class="left_bt2" align="center" width="10%">
						财务入账人名称
					</td>
					<td class="left_bt2" align="center" width="10%">
						财务是否入账
					</td>
					<td class="left_bt2" align="center" width="10%">
						财务入账时间
					</td>
					<td class="left_bt2" align="center" width="10%">
						操作
					</td>
				</tr>

				<s:iterator id="f" value="pageInfo.result" status="st">
					<tr align=center>
						<td align="center" class="left_txt">
							${f.fid}
						</td>
						<td align="center" class="left_txt">
							${f.fcode}
						</td>
						<td align="center" class="left_txt">
							${f.user.uname}
						</td>
						<td align="center" class="left_txt">
							<s:if test="%{#f.fenter==1}">是</s:if>
							<s:else>否</s:else>
						</td>
						<td align="center" class="left_txt">
							${f.fdate}
						</td>
						<td align="center" class="left_txt">
							<a href="finance/finance_Finance_updateEnter.action?fid=${fid}">确认入账</a>
							|
							<a href="finance/finance_Finance_findFinanceById.action?fid=${fid}">修改</a>
							|
							<a href="finance/finance_Finance_deleteFinance.action?fid=${fid}">删除</a>

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
			创建财务入账
		</h1>
		<form action="finance/finance_Finance_createFinance.action"
			method="post">
			财务入账编码
			<input type="text" name="fcode" value="123" />
			<br />
			财务入账人ID
			<input type="text" name="user.uid" value="1" />
			<br />
			财务是否入账
			<!--<input type="text" name="fenter" value="123" />-->
			<input type="radio" name="fenter" value="1"/>
			是
			<input type="radio" name="fenter" value="2" checked="checked"/>
			否
			<br />
			<input type="submit" value="创建" />
		</form>

	</body>
</html>
