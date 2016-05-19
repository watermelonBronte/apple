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
		<title>维修单列表</title>
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

		<div class="main-content" style="width: 993px">

			<div class="btn-toolbar list-toolbar">
				<br />
				<a href="repairs/repairs_Repairs_addRepairs.action"
					class="btn btn-primary"><i class="fa fa-plus"></i> 添加维修单</a>
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
				维修单列表
			</h1>

			<form action="" id="_form" method="post">
				<table class="table" style="text-align: center">

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
								<a
									href="repairs/repairs_Repairs_updateState.action?reid=${reid}">维修完成</a>

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
		</div>
		<!--
		<hr/>
		<h1>
			填写维修单
		</h1>
		<form action="repairs/repairs_Repairs_createRepairs.action"
			method="post">
			资产ID
			<input type="text" name="asset.aid" value="2" />
			<s:select list="assetList" listKey="aid" listValue="aid"
				name="asset.aid" />
			<br />
			送修人名称
			<input type="text" name="user.uid" value="1" />
			<s:select list="userList" listKey="uid" listValue="uname"
				name="user.uid" />
			<br />
			损坏情况
			<input type="text" name="recondition" value="非常严重" />
			<br />
			维修费用
			<input type="text" name="reprice" value="100" />
			￥
			<br />
			状态
			0-维修中 1-维修完成
			<input type="radio" name="restate" value="0" checked="checked" />
			维修中
			<input type="radio" name="restate" value="1" />
			维修完成
			<br />
			<input type="submit" value="创建" />
		</form>

	-->
	</body>
</html>
