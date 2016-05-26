<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
			<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery.date_input.pack.js"></script>
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/calendar1.css">
		<script type="text/javascript">
	$(function() {
		$('.date_picker').date_input();
	})
</script>

		<script type="text/javascript">

window.onload=function(){

	var oDiv=document.getElementById('charcolor');
	var aTd=oDiv.getElementsByTagName('tr');
	for( var i=1;i<aTd.length-1;i++){
	
		if(i%2!=0){
		
		aTd[i].style.background='#F7F7F7';
			aTd[i].onmouseover=function(){
			
			this.style.background='#E3E3E3';
		
		}
	
		aTd[i].onmouseout=function(){
			
			this.style.background='#F7F7F7';

		}
		
		}
		else
		{
		aTd[i].onmouseover=function(){
			
			this.style.background='#E3E3E3';
		
		}
	
		aTd[i].onmouseout=function(){
			
			this.style.background='#fff';

		}
		
		}
	
			
		
	
	}
	
//	#E0EEE0 #EEE5DE #FAF0E6
	
}

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


        var va;
 function text1(va1){//获取当前id
 va=va1;
        }
 function del1(){//改变url
 	dataP="asset/asset_Asset_deleteAsset.action?aid="+va;
 	 window.location.href=encodeURI(dataP);
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
			<h3>
				列表
			</h3>
			<div class="btn-toolbar list-toolbar">
				<br />
				<a href="#myModal1" role="button" data-toggle="modal" class="btn btn-primary"><i
					class="fa fa-plus"></i> 添加资产</a>
				
				<a class="btn btn-default" href="asset/asset_Asset_excelInAsset.action?">导入</a>
				
				<a class="btn btn-default" href="asset/asset_Asset_excelOutAsset.action?">导出</a>
				
			
				<div class="btn-group">
				</div>
			</div>

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
				
				使用人ID:
				<input type="text" name="uid" style="width: 100px; margin: 5px" />
				财务入账ID:
				<input type="text" name="fid" style="width: 100px; margin: 5px" />
				采购单ID:
				<input type="text" name="pdid" style="width: 100px; margin: 5px" />
				<!--<input type="text" name="value" />-->

				<input type="submit" value="查找" class="btn btn-default" />
				<br />
			</form>
			<!--<a href="asset/asset_Asset_addAsset.action">添加资产</a>-->

			<form action="" id="_form" method="post">
				<table class="table" style="text-align: center" id="charcolor">
					<thead>
						<tr>
							<th>
								资产ID
							</th>
							
							<th>
								资产名称
							</th>
							<th>
								使用人名称
							</th>
							<!--<th>
								财务入账人名称
							</th>

							--><th>
								库存状态
							</th>
							<th>
								入库时间
							</th>
							<th>
								操作
							</th>

							<!--
						<th>
							操作
						</th>
					-->
							<th style="width: 3.5em;"></th>
						</tr>
					</thead>
					<s:iterator id="a" value="pageInfo.result" status="st">
						<tr align=center>
							<td align="center" class="left_txt">
								${a.aid}
							</td>
							
							<td align="center" class="left_txt">
								${a.purchaseDetail.aname}
							</td>
							<td align="center" class="left_txt">
								${a.user.uname}
							</td>
							<!--<td align="center" class="left_txt">
								${a.finance.user.uname}
							</td>

							--><td align="center" class="left_txt">
								<!--0 库存 1 在用 2 故障 3 报废 -1 删除-->
								<s:if test="%{#a.astate==0}">库存</s:if>
								<s:elseif test="%{#a.astate==1}">在用</s:elseif>
								<s:elseif test="%{#a.astate==2}">故障</s:elseif>
								<s:elseif test="%{#a.astate==3}">报废</s:elseif>
								<s:else>删除</s:else>
							</td>
							<!--<td align="center" class="left_txt">
								${a.adate}
							</td>
							-->
							<td>
								<fmt:formatDate value="${a.adate}" pattern="yyyy-MM-dd" />
							</td>

							<td>
								<a href="asset/asset_Asset_findAssetById.action?aid=${aid}">详情</a>
								|
								<a href="finance/finance_Finance_addFinance.action?aid=${aid}">财务入账</a>

							</td>
							<!--<td align="center" class="left_txt">
								<a href="asset/asset_Asset_findAssetById.action?aid=${aid}">详情</a>
								|
								<a href="asset/asset_Asset_deleteAsset.action?aid=${aid}">删除</a>

							</td>
						-->

							<td>

								<a href="#myModal" onclick="text1(${a.aid})" role="button" data-toggle="modal"><i
									class="fa fa-trash-o"></i>
								</a>
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
								<font color=#808080> <a
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



				<div class="modal small fade" id="myModal" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">
									×
								</button>
								<h3 id="myModalLabel">
									删除确认
								</h3>
							</div>
							<div class="modal-body">
								<p class="error-text">
									<i class="fa fa-warning modal-icon"></i>确定删除采购单?
								</p>
							</div>
							<div class="modal-footer">
								<button class="btn btn-default" data-dismiss="modal"
									aria-hidden="true">
									取消
								</button>
								<button class="btn btn-danger" data-dismiss="modal"
									onclick="del1()" >
									删除
								</button>
							</div>
						</div>
					</div>
				</div>

			</form>
		</div>

		<script
			src="${pageContext.request.contextPath}/lib/bootstrap/js/bootstrap.js"></script>
		<script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
    
    






		<div class="modal small fade " id="myModal1" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog " style="width: 550px">
				<div class="modal-content"
					style="background:#eee url(${pageContext.request.contextPath}/images/modal-gloss.png) no-repeat -200px -80px;position:absolute;z-index:101;padding:5px 10px 7px;-moz-border-radius:5px;-webkit-border-radius:5px;border-radius:5px;-moz-box-shadow:0 0 10px rgba(0,0,0,.4);-webkit-box-shadow:0 0 10px rgba(0,0,0,.4);-box-shadow:0 0 10px rgba(0,0,0,.4);">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">
							×
						</button>
						<h2
							style="height: 20px; margin-top: 10px; font-weight: 600; color: #990000">
						创建资产
						</h2>
					</div>
					<form
						action="asset/asset_Asset_createAsset.action"
						method="post">
						<div class="modal-body">

							<table cellSpacing="0" cellPadding="8" align="center"
								style="text-align: center">
								
								<tr>
									<td style="height: 40px; width: 120px; text-align: left">
										卡片编号：
									</td>
									<td style="height: 40px; width: 150px; text-align: left" colspan="3">
										
										<input type="text" name="cid" value="1" />
									</td>
								</tr>
									<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										资产类别：
									</td>
									<td style="height: 40px; width: 100px; text-align: left">

										
										<s:select list="assetCategoryList" listKey="acid"
							listValue="acname" name="assetCategory.acid" />

									</td>
									<td style="height: 40px; width: 80px; text-align: left">
										资产名称：
									</td>
									<td style="height: 40px; width: 100px; text-align: left">

										
										<s:select list="purchaseDetailList" listKey="pdid"
							listValue="aname" name="purchaseDetail.pdid" />

									</td>
								</tr>
								
								<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										使用人：
									</td>
									<td style="height: 40px; width: 100px; text-align: left">

										
										<s:select list="userList" listKey="uid" listValue="uname"
							name="user.uid" />

									</td>
									<td style="height: 40px; width: 130px; text-align: left">
										财务入账单号：
									</td>
									<td style="height: 40px; width: 100px; text-align: left">

										
										<s:select list="financeList" listKey="fid" listValue="fcode"
							name="finance.fid" />

									</td>
								</tr>
								<!--<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										财务入账单编号：
									</td>
									<td style="height: 40px; width: 150px; text-align: left">

										
										<s:select list="financeList" listKey="fid" listValue="fcode"
							name="finance.fid" />

									</td>
								</tr>
								
								
								
								--><tr>


									<td style="height: 40px; width: 80px; text-align: left">
										入库时间：
									</td>
									<td style="height: 40px; width: 150px; text-align: left" colspan="3">

										<input
											style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 4px; border-radius: 3px;background-repeat:no-repeat; background-position:right center; background-image:url(${pageContext.request.contextPath}/images/icon.png)"
											type="text" class="date_picker" value="${adate}"
											name="adate" />
									</td>
								</tr>
								<tr>


									<td style="height: 40px; width: 80px; text-align: left">
										入库状态：
									</td>
									<td style="height: 60px; width: 150px; text-align: left" colspan="3">

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

									</td>
								</tr><!--
								
								<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										资产名称：
									</td>
									<td style="height: 40px; width: 150px; text-align: left">

										
										<s:select list="purchaseDetailList" listKey="pdid"
							listValue="aname" name="purchaseDetail.pdid" />

									</td>
								</tr>
								
								
								
							--><tr>


									<td style="height: 40px; width: 80px; text-align: left">
										是否打印标签：
									</td>
									<td style="height: 60px; width: 150px; text-align: left" colspan="3">

										<input type="radio" name="tprint" value="1" />
						是
						<input type="radio" name="tprint" value="2" checked="checked" />
						否

									</td>
								</tr>



								<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										一维码地址：
									</td>
									<td style="height: 40px; width: 150px; text-align: left" colspan="3">
										
											<input type="text" name="onepath" value="1" />
									</td>
								</tr>
								
								<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										二维码地址：
									</td>
									<td style="height: 40px; width: 150px; text-align: left" colspan="3">
										
										<input type="text" name="twopath" value="1" />
									</td>
								</tr>
								
								<tr>
									<td style="height: 40px; width: 80px; text-align: left">
										条码：
									</td>
									<td style="height: 40px; width: 150px; text-align: left" colspan="3">
										
										<input type="text" name="barcode" value="1" />
									</td>
								</tr>
<tr>


									<td style="height: 40px; width: 80px; text-align: left">
										备注：
									</td>
									<td style="height: 60px; width: 150px; text-align: left" colspan="3">
				
										<textarea name="anote" value="1"
											style="width: 300px; height: 70px;">
 </textarea>
									</td>
								</tr>

								<tr style="height: 25px;">
									<td></td>
								</tr>
								<tr style="border-top: 1px solid #e5e5e5;">
									<td colspan="2" align="right">
										<br />
										<input class="btn btn-danger" type="submit" value="创建" />
									</td>

									<td colspan="2" align="left">
										<br />
										<button style="margin: 10px;" class="btn btn-default"
											data-dismiss="modal" aria-hidden="true">
											取消
										</button>
									</td>
								</tr>

							</table>

						</div>


					</form>
				</div>
			</div>
		</div>
	</body>
</html>
