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
		<title>资产列表</title>
		<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href='http://fonts.useso.com/css?family=Open+Sans:400,700'
			rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

		<script
			src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js"
			type="text/javascript"></script>

		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/theme.css">
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/css/premium.css">
		<link rel="apple-touch-icon-precomposed" sizes="144x144"
			href="../assets/ico/apple-touch-icon-144-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="114x114"
			href="../assets/ico/apple-touch-icon-114-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="72x72"
			href="../assets/ico/apple-touch-icon-72-precomposed.png">
		<link rel="apple-touch-icon-precomposed"
			href="../assets/ico/apple-touch-icon-57-precomposed.png">


		<script type="text/javascript"
			src="http://www.js-css.cn/jscode/jquery.min.js"></script>

		<script type="text/javascript">



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

	<body class=" theme-blue" style="width: 993px">
		<script type="text/javascript">
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

		<script type="text/javascript">
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
    </script>
		<div class="main-content" style="width: 993px">

			<div class="btn-toolbar list-toolbar">
				<br />
				<a href="asset/asset_Asset_addAsset.action" class="btn btn-primary"><i
					class="fa fa-plus"></i> 添加资产</a>
				<button class="btn btn-default">
					导入
				</button>
				<button class="btn btn-default">
					导出
				</button>
				<div class="btn-group">
				</div>
			</div>
			<h1>
				资产列表
			</h1>
			<form action="asset/asset_Asset_SearchAsset.action" method="post">
				根据
				<!--<select id="select" name="attr">
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
				
				-->
				资产类型ID
				<input type="text" name="acid"  />
				使用人ID
				<input type="text" name="uid" />
				财务入账ID
				<input type="text" name="fid"  />
				采购单ID
				<input type="text" name="pdid" />
				<!--<input type="text" name="value" />-->

				<input type="submit" value="查找" />
				<br />
			</form>
			<!--<a href="asset/asset_Asset_addAsset.action">添加资产</a>-->

			<form action="" id="_form" method="post">
				<table class="table" style="text-align: center">
					<tr class="datalist_head">
						<td class="left_bt2" align="center" width="10%">
							卡片编号
						</td>
						<td class="left_bt2" align="center" width="10%">
							资产类别名称
						</td>
						<td class="left_bt2" align="center" width="10%">
							资产名称
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
								${a.purchaseDetail.aname}
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
		</div>
		<!--<h1>
			创建资产
		</h1>
		<form action="asset/asset_Asset_createAsset.action" method="post">
			卡片编号
			<input type="text" name="cid" value="1" />
			<br />
			资产类别名称
			<input type="text" name="assetCategory.acid" value="1" />
			<s:select list="assetCategoryList" listKey="acid" listValue="acname"
				name="assetCategory.acid" />
			<br />
			使用人名称
			<input type="text" name="user.uid" value="1" />
			<s:select list="userList" listKey="uid" listValue="uname"
				name="user.uid" />
			<br />
			财务入账单编号
			<input type="text" name="finance.fid" value="1" />
			<s:select list="financeList" listKey="fid" listValue="fcode"
				name="finance.fid" />
			<br />
			入库时间
			<input type="text" name="adate" value="1" />
			<input
				style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 7px; border-radius: 3px;"
				type="text" class="date_picker" value="${adate}" name="adate" />
			<br />
			入库状态
			<input type="radio" name="astate" value="0" checked="checked" />
			库存
			<input type="radio" name="astate" value="1" />
			在用
			<input type="radio" name="astate" value="2" />
			故障
			<input type="radio" name="astate" value="3" />
			报废
			<input type="radio" name="astate" value="-1" />
			删除
			<br />
			资产名称
			<input type="text" name="purchaseDetail.pdid" value="1" />
			<s:select list="purchaseDetailList" listKey="pdid" listValue="aname"
				name="purchaseDetail.pdid" />
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
	-->
	</body>
</html>
