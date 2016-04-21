<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
		<!-- <form action="admin_login/login.action" method="post">
  	姓名：<input type="text" name="username" /> <br/>
  	密码：<input type="text" name="pwd" />
  	<input type="submit" value="提交" />
  	</form>
   -->
		<!-- 资源类别 -->
		<a href="asset_category/test_AssetCategory_createAssetCategory.action">测试创建资源类别</a>
		<br>

		<a href="asset_category/test_AssetCategory_deleteAssetCategory.action">测试删除资源类别</a>
		<br>

		<a href="asset_category/test_AssetCategory_updateAssetCategory.action">测试修改资源类别</a>
		<br>

		<a href="asset_category/test_AssetCategory_findAssetCategory.action">测试查找资源类别</a>
		<br>
		
		<a href="asset_category/test_AssetCategory_pageAssetCategory.action">测试分页资源类别</a>
		<br>
		<hr />
		<!-- 部门 -->
		<a href="department/test_Department_createDepartment.action">测试创建部门</a>
		<br>

		<a href="department/test_Department_deleteDepartment.action">测试删除部门</a>
		<br>

		<a href="department/test_Department_updateDepartment.action">测试修改部门</a>
		<br>

		<a href="department/test_Department_findDepartment.action">测试查找部门</a>
		<br>
		<hr />
		<!-- 参数 -->
		<a href="parameter/test_Parameter_createParameter.action">测试创建参数信息</a>
		<br>

		<a href="parameter/test_Parameter_deleteParameter.action">测试删除参数信息</a>
		<br>

		<a href="parameter/test_Parameter_updateParameter.action">测试修改参数信息</a>
		<br>

		<a href="parameter/test_Parameter_findParameter.action">测试查找参数信息</a>
		<br>

	</body>
</html>
