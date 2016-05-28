<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="utf-8">
		<title>主界面</title>
		<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">

		<link href='http://fonts.useso.com/css?family=Open+Sans:400,700'
			rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css"
			href="../../lib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet"
			href="../../lib/font-awesome/css/font-awesome.css">

		<script src="../../lib/jquery-1.11.1.min.js" type="text/javascript"></script>

		<script src="../../lib/jQuery-Knob/js/jquery.knob.js"
			type="text/javascript"></script>
		<script type="text/javascript">
        $(function() {
            $(".knob").knob();
        });
    </script>
		<link rel="stylesheet" type="text/css" href="../../css/theme.css">
		<link rel="stylesheet" type="text/css" href="../../css/premium.css">

	</head>
	<!-- 杨铮 2016/5/10-->
	<body class=" theme-blue">



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

function changeSrc(href,tex)
{ 
//alert(he);
//var user=document.getElementById('user');
	var oDiv=document.getElementById('header');
	oDiv.innerHTML=tex;
document.getElementById("myframe").src=href;
}

        
    </script>
		<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

#user li a:hover {
	color: #000093;
	font-size: 15px;
	background-color: #F0F0F0;
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

		<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
		<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

		<!-- Le fav and touch icons -->
		<link rel="shortcut icon" href="../assets/ico/favicon.ico">
		<link rel="apple-touch-icon-precomposed" sizes="144x144"
			href="../assets/ico/apple-touch-icon-144-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="114x114"
			href="../assets/ico/apple-touch-icon-114-precomposed.png">
		<link rel="apple-touch-icon-precomposed" sizes="72x72"
			href="../assets/ico/apple-touch-icon-72-precomposed.png">
		<link rel="apple-touch-icon-precomposed"
			href="../assets/ico/apple-touch-icon-57-precomposed.png">

		<!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
		<!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
		<!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
		<!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
		<!--[if (gt IE 9)|!(IE)]><!-->

		<!--<![endif]-->

		<div class="navbar navbar-default" role="navigation">
			<div class="navbar-header">

				<a class="" href="index.html"><span class="navbar-brand"><span
						class="fa fa-paper-plane"></span> 资产管理系统</span>
				</a>
			</div>

			<div class="navbar-collapse collapse" style="height: 1px;">
				<ul id="main-menu" class="nav navbar-nav navbar-right">
					<li class="dropdown hidden-xs">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span
							class="glyphicon glyphicon-user padding-right-small"
							style="position: relative; top: 3px;"></span> ${loginUname} <i
							class="fa fa-caret-down"></i> </a>

						<ul class="dropdown-menu" id="user">
							<li class="dropdown-header"></li>
							<li>
								<a href="./">个人信息</a>
							</li>
							<li>
								<a href="./">修改密码</a>
							</li>

							<li class="divider"></li>
							<li>
								<a tabindex="-1" href="../../login.jsp">退出</a>
							</li>
						</ul>
					</li>
				</ul>

			</div>
		</div>
		<div class="sidebar-nav">
			<ul>
				<!-- <li><a href="#" data-target=".dashboard-menu" class="nav-header" data-toggle="collapse"><i class="fa fa-fw fa-dashboard"></i> 资产管理<i class="fa fa-collapse"></i></a></li>-->
				<li>
					<a href="#" data-target=".accounts-menu" class="nav-header"
						data-toggle="collapse"><i class="fa fa-fw fa-briefcase"></i>
						资产管理 <i class="fa fa-collapse"></i>
					</a>
				</li>
				<li>
					<ul class="accounts-menu nav nav-list collapse">
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../queryPurchase.action','验收登记')"><span
								class="fa fa-caret-right"></span> 验收登记</a>
						</li>


						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../asset/asset_Asset_pageAsset.action','资产列表')"><span
								class="fa fa-caret-right"></span> 资产列表</a>
						</li>
						<!--<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../finance/finance_Finance_pageFinance.action','财务入账')"><span
								class="fa fa-caret-right"></span> 财务入账</a>
						</li>




						--><li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../transBills/transBills_TransBills_pageTransBills.action','资产调拨')"><span
								class="fa fa-caret-right"></span> 资产调拨</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../scrap/scrap_Scrap_pageScrap.action','资产报废')"><span
								class="fa fa-caret-right"></span> 资产报废</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../repairs/repairs_Repairs_pageRepairs.action','资产维修')"><span
								class="fa fa-caret-right"></span> 资产维修</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../assetTrans/assetTrans_AssetTrans_pageAssetTrans.action','资产移交')"><span
								class="fa fa-caret-right"></span> 资产移交</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../checked/checked_Checked_pageChecked.action','资产盘点')"><span
								class="fa fa-caret-right"></span> 资产盘点</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../queryReturn.action','领用归还')"><span
								class="fa fa-caret-right"></span> 领用归还</a>
						</li>
					</ul>
				</li>

				<li>
					<a href="#" data-target=".premium-menu"
						class="nav-header collapsed" data-toggle="collapse"><i
						class="fa fa-fw fa-fighter-jet"></i> 统计报表<i class="fa fa-collapse"></i>
					</a>
				</li>
				<li>
					<ul class="premium-menu nav nav-list collapse">

						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../asset/asset_Asset_chartAsset.action','按资产类型统计报表')"><span
								class="fa fa-caret-right"></span> 按资产类型统计报表</a>
						</li>
						<!--
            <li ><a href="#"><span class="fa fa-caret-right"></span> 按设备名称统计报表</a></li>
            <li ><a href="#"><span class="fa fa-caret-right"></span> 按采购内容统计报表</a></li>
            <li ><a href="#"><span class="fa fa-caret-right"></span> 按业务操作统计报表</a></li>
            <li ><a href="#"><span class="fa fa-caret-right"></span> 按财务内容统计报表</a></li>
            <li ><a href="#"><span class="fa fa-caret-right"></span> 按供应商统计报表</a></li>
           
    -->
					</ul>
				</li>

				<li>
					<a href="#" data-target=".legal-menu" class="nav-header collapsed"
						data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> 系统管理<i
						class="fa fa-collapse"></i>
					</a>
				</li>
				<li>
					<ul class="legal-menu nav nav-list collapse">
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../roleQuery.action','角色信息')"><span
								class="fa fa-caret-right"></span> 角色管理</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../department/test_Department_pageDepartment.action','部门信息')"><span
								class="fa fa-caret-right"></span> 部门管理</a>
						</li>
						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../asset_category/test_AssetCategory_pageAssetCategory.action','资产类别列表')"><span
								class="fa fa-caret-right"></span> 资产类别管理</a>
						</li>

						<li>
							<a href="javascript:void(0);"
								onclick="changeSrc('../../parameter/test_Parameter_pageParameter.action','参数配置列表')"><span
								class="fa fa-caret-right"></span> 参数配置</a>
						</li>

					</ul>
				</li>

				<li>
					<a id="user" href="javascript:void(0);" onclick="changeSrc('../../userAction.action', '用户信息')" class="nav-header glyphicon glyphicon-user padding-right-small"><span
						style="padding-left: 8px;">人员管理</span>
					</a>
				</li>

			</ul>
		</div>

		<div class="content">
			<div class="header ">





				<h1 class="page-title" id="header"></h1>
				<!--
                    <ul class="breadcrumb">
            <li><a href="welcome.jsp">Home</a> </li>
            <li class="active">Users</li>
        </ul>
        
        
    -->
			</div>





			<div style="">
				<iframe frameborder="0" src="welcome.jsp" id="myframe"
					style="width: 993px; height: 700px; margin-left: -7px; margin-top: -22px;"></iframe>
			</div>

		</div>
		<hr>
		<!--<footer>
                <hr>

               
               
            </footer>


    -->
		<script src="../../lib/bootstrap/js/bootstrap.js"></script>
		<script type="text/javascript">
	$("[rel=tooltip]").tooltip();
	$(function() {
		$('.demo-cancel-click').click(function() {
			return false;
		});
	});
</script>

	</body>
</html>
