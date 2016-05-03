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



	</head>

	<body>
		<h1>
			创建资产
		</h1>
		<form
			action="asset/asset_Asset_createAsset.action"
			method="post">
			资产类别
			<select id="acid" name="acid">
				<c:forEach items="${assetCategory}" var="ac">
					<option value="${assetCategory}"
						<c:if test="${assetCategory.acid==ac.acid}"><c:out value="selected"/></c:if>>
						${ac.acname}(${ac.accode})
					</option>
				</c:forEach>
			</select>
			<!--<select id="acid" name="acid">
			<s:iterator id="acid" value="pageInfo.result" status="st"></s:iterator></select>
				--><br />
			资产类别名称
			<input type="text" name="acname" value="长江一号" />
			<br />
			
			<input type="submit" value="创建" />
		</form>


	</body>
</html>
