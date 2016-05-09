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
			资产列表
		</h1>
		<!--<a href="asset/asset_Asset_addAsset.action">添加资产</a>-->

		<form action="" id="_form" method="post">
			<table width="100%" border="1" cellpadding="0"
				style="margin-top: 5px;" cellspacing="0">
				<tr class="datalist_head">
					<td class="left_bt2" align="center" width="10%">
						卡片编号
					</td>
					<td class="left_bt2" align="center" width="10%">
						资产类别名称
					</td>
					<td class="left_bt2" align="center" width="10%">
						使用人名称
					</td>
					<td class="left_bt2" align="center" width="10%">
						财务入账人名称
					</td>
					<td class="left_bt2" align="center" width="10%">
						采购人名称
					</td>
					<td class="left_bt2" align="center" width="10%">
						库存状态
					</td>
					<td class="left_bt2" align="center" width="10%">
						入库时间
					</td>
					<td class="left_bt2" align="center" width="10%">
						操作
					</td>
				</tr>

				<s:iterator id="a" value="pageInfo.result" status="st">
					<tr align=center>
						<td align="center" class="left_txt">
							${a.cid}
						</td>
						<td align="center" class="left_txt">
							${a.assetCategory.acname}
						</td>
						<td align="center" class="left_txt">
							${a.user.uname}
						</td>
						<td align="center" class="left_txt">
							${a.finance.user.uname}
						</td>
						<td align="center" class="left_txt">
							${a.purchaseNote.user.uname}
						</td>
						<td align="center" class="left_txt">
							<!--0 库存 1 在用 2 故障 3 报废 -1 删除-->
							<s:if test="%{#a.astate==0}">库存</s:if>
							<s:elseif test="%{#a.astate==1}">在用</s:elseif>
							<s:elseif test="%{#a.astate==2}">故障</s:elseif>
							<s:elseif test="%{#a.astate==3}">报废</s:elseif>
							<s:else>删除</s:else>
						</td>
						<td align="center" class="left_txt">
							${a.adate}
						</td>
						<td align="center" class="left_txt">
							<a href="asset/asset_Asset_findAssetById.action?aid=${aid}">详情</a>
							|
							<a href="asset/asset_Asset_deleteAsset.action?aid=${aid}">删除</a>

						</td>
					</tr>
				</s:iterator>
				<!--<tr>
					<td>
						<a href="asset/asset_Asset_inAsset.action?aid=${aid}">导入</a>
					</td>
					<td>
						<a href="asset/asset_Asset_outAsset.action?aid=${aid}">导出</a>
					</td>
				</tr>
				-->
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


	</body>
</html>
