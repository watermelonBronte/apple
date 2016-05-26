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
		<title>移交单列表</title>
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
		<script>
	
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
   
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
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


	</head>

	<body class=" theme-blue" style="width: 993px">
		<h3>
			移交单列表
		</h3>
		<div class="main-content" style="width: 993px">

			<div class="btn-toolbar list-toolbar">
				<br />
				<a href="#myModal1" role="button" data-toggle="modal"
					class="btn btn-primary"><i class="fa fa-plus"></i> 添加移交单</a>
				<!--<button class="btn btn-default">
					导入
				</button>
				<button class="btn btn-default">
					导出
				</button>
				--><div class="btn-group">
				</div>
			</div>



			<form action="" id="_form" method="post">
				<table class="table" style="text-align: center" id="charcolor">
					<thead>
						<tr>
							<th>
								移交单ID
							</th>
							<th>
								移交人
							</th>
							<th>
								移交发起日期
							</th>
							<!--<th>
								移交完成日期
							</th>
							--><th>
								移交类型
							</th>
							<th>
								移交状态
							</th>
							<th>
								清单
							</th>
							<!--<th>
								操作
							</th>
							--><th style="width: 3.5em;"></th>
						</tr>
					</thead>
					<s:iterator id="at" value="pageInfo.result" status="st">
						<tr align=center>
							<td>
								${at.atid}
							</td>
							<td>
								${at.user.uname}
							</td>
							<td>
								<fmt:formatDate value="${at.atrdate}" pattern="yyyy-MM-dd" />

							</td>
							<!--<td>
								<fmt:formatDate value="${at.atfdate}" pattern="yyyy-MM-dd" />

							</td>
							--><td>
								<!--
							0- 1-
								-->
								<s:if test="%{#at.attype==0}">第一种类型</s:if>
								<s:else>第二种类型</s:else>
							</td>
							<td>
								<s:if test="%{#at.atstate==0}">待移交</s:if>
								<s:else>移交完毕</s:else>
							</td>
							<td>
								<a
									href="assetTransDetail/assetTransDetail_AssetTransDetail_pageAssetTransDetailByAtid.action?atid=${atid}">移交清单</a>
							

								<!--
								|
								<a
									href="assetTrans/assetTrans_AssetTrans_deleteAssetTrans.action?atid=${atid}">删除</a>
								-->
								<s:if test="at.atstate==0">
								|
									<a
										href="assetTrans/assetTrans_AssetTrans_updateState.action?atid=${atid}"
										onClick="return confirm('确定移交?');">确认移交</a>
								</s:if>
								
							</td>
							<td>
								<a href="#myModal" role="button" data-toggle="modal"><i
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
									<i class="fa fa-warning modal-icon"></i>确定删除?
								</p>
							</div>
							<div class="modal-footer">
								<button class="btn btn-default" data-dismiss="modal"
									aria-hidden="true">
									取消
								</button>
								<button class="btn btn-danger" data-dismiss="modal"
									onclick="window.location='assetTrans/assetTrans_AssetTrans_deleteAssetTrans.action?atid=${at.atid}'">
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
							填写移交单
						</h2>
					</div>
					<form
						action="assetTrans/assetTrans_AssetTrans_createAssetTrans.action"
						method="post">
						<div class="modal-body">

							<table cellSpacing="0" cellPadding="8" align="center"
								style="text-align: center">
								<tr>


									<td style="height: 40px; width: 130px; text-align: left">
										移交人：
									</td>
									<td style="height: 40px; width: 130px; text-align: left">

										<!--<s:select list="userList" listKey="uid" listValue="uname"
				name="user.uid" />-->
										${loginUname}
									</td>
								</tr>
								<!--<tr>
  <td  style="height:40px;width:80px;text-align:left">调出人ID：</td>
 <td  style="height:40px;width:150px;text-align:left">
 <input type="text" name="acname" value="空调" class="input" size="12" />
 <s:select list="userList" listKey="uid" listValue="uname" name="userByOutuid.uid"   />
 
 </td>
 </tr>
 
 -->
								<tr>


									<td style="height: 40px; width: 100px; text-align: left">
										移交发起时间：
									</td>
									<td style="height: 40px; width: 130px; text-align: left">


										<!--<input type="text" name="supacid" value="1" class="input" size="12" />
 -->
										<input
											style="width: 240px; background: #fefefe; border: 1px solid #bbb; font-size: 14px; color: #333; padding: 4px; border-radius: 3px;background-repeat:no-repeat; background-position:right center; background-image:url(${pageContext.request.contextPath}/images/icon.png)"
											type="text" class="date_picker" value="${atrdate}"
											name="atrdate" />


									</td>
								</tr>
								<tr>


									<td style="height: 40px; width: 100px; text-align: left">
										移交类型：
									</td>
									<td style="height: 40px; width: 130px; text-align: left">
										<input type="radio" name="attype" value="0" checked="checked" />
										第一种类型
										<input type="radio" name="attype" value="1" />
										第二种类型
									</td>
								</tr>


								<tr>


									<td style="height: 40px; width: 100px; text-align: left">
										移交状态：
										<!--0-待移交 1-移交完毕-->
									</td>
									<td style="height: 40px; width: 130px; text-align: left">
										<input type="radio" name="atstate" value="0" checked="checked" />
										待移交
										<input type="radio" name="atstate" value="1" />
										移交完毕
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
