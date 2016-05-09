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
<script type="text/javascript" src="http://www.js-css.cn/jscode/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.date_input.pack.js"></script> 
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/calendar.css">
  
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


			function listAll(){
				var flag=confirm("全部导出可能花费您一分钟左右，确定全部导出吗？");
				if(flag){
					location="allToExcel.action";
				}
			}
	

</script>



	</head>

	<body>
		<h1>
			资产列表
		</h1>
			<!--<input type="button" value="导出全部" onclick="listAll()"/>-->
		<form action="asset/asset_Asset_SearchAsset.action" method="post">
			根据
			<select id="select" name="attr">
				<option value="ac" selected>
					资产类别ID
				</option>
				<option value="u">
					使用人ID
				</option>
				<option value="f">
					财务入账ID
				</option>
				<option value="pn">
					采购ID
				</option>
			</select>
			<input type="text" name="value" />

			<input type="submit" value="查找" />
			<br />
		</form>
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

		<h1>
			创建资产
		</h1>
		<form action="asset/asset_Asset_createAsset.action" method="post">
			卡片编号
			<input type="text" name="cid" value="1" />
			<br />
			资产类别ID
			<input type="text" name="assetCategory.acid" value="1" />
			<br />
			使用人ID
			<input type="text" name="user.uid" value="1" />
			<br />
			财务入账单ID
			<input type="text" name="finance.fid" value="1" />
			<br />
			入库时间
			<!--<input type="text" name="adate" value="1" />-->
			<input  style="width:240px;background: #fefefe;border: 1px solid #bbb;font-size: 14px;color: #333;padding: 7px;border-radius: 3px;" type="text" class="date_picker" value="${adate}" name="adate" />
			<br />
			入库状态
			<input type="radio" name="astate" value="0"  checked="checked" />
			库存
			<input type="radio" name="astate" value="1"/>
			在用
			<input type="radio" name="astate" value="2"/>
			故障
			<input type="radio" name="astate" value="3"/>
			报废
			<input type="radio" name="astate" value="-1"/>
			删除
			<br />
			采购清单ID
			<input type="text" name="purchaseDetail.pdid" value="1" />
			<br />
			是否打印标签
			<input type="radio" name="tprint" value="1" />
			是
			<input type="radio" name="tprint" value="2" checked="checked" />
			否
			<br />
			一维码地址
			<input type="text" name="onepath" value="1" />
			<br />
			二维码地址
			<input type="text" name="twopath" value="1" />
			<br />
			条码
			<input type="text" name="barcode" value="1" />
			<br />
			备注
			<input type="text" name="anote" value="1" />
			<br />
			<input type="submit" value="创建" />
		</form>
	</body>
</html>
