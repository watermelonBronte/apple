<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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

<style>
tr{height:39px;}

font{text-shadow:#ccc 1px 1px 1px; }
   table
        {
            border-collapse: collapse;
        }
        td
        {
            border: #ccc solid 1px;
            padding: 5px;
        }
</style>

	</head>

	<body>
	<!--<h3>维修单详情</h3>
		资产维修ID
		<input type="text" name="reid" value="${reid}" readonly="readonly" />
		<br />
		资产ID
		<input type="text" name="asset.aid"  value="${asset.aid}"  readonly="readonly" />
		<br />
		送修人名称
		<input type="text" name="user.uname"  value="${user.uname}" readonly="readonly" />
		<br />
		送修部门
		<input type="text" name="user.department.dname"  value="${user.department.dname}" readonly="readonly" />
		<br />
		损坏情况
		<input type="text" name="recondition"  value="${recondition}" readonly="readonly" />
		<br />
		维修费用
		<input type="text" name="reprice"  value="${reprice}"  readonly="readonly" />
		￥
		<br />
		状态
		0-维修中 1-维修完成
		<s:if test="restate==0">
		<input type="radio" name="restate" value="0" checked="checked" />
		维修中
		<input type="radio" name="restate" value="1" />
		维修完成
		</s:if>
		<s:else>
		<input type="radio" name="restate" value="0"/>
		维修中
		<input type="radio" name="restate" value="1" checked="checked" />
		维修完成
		</s:else>
		<br />

	
		<a href="repairs/repairs_Repairs_pageRepairs.action">返回</a>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	--><table align="center" border="1" cellpadding="4" cellspacing="0" width="95%"  >
               <tr align="center"><td colspan="7" style="font-family: @Adobe 宋体 Std L; font-size: 25px;background-color: #A2B5CD;color:#fff"">维修单详情</td></tr>
               
               
                
                <tr>
                    <td width="14%" height="37px" style="background-color: #F4F4F4">
             资产维修ID：
                    </td>
                    <td width="19%">
                     ${reid}
                    </td>
                    <td width="17%" style="background-color: #D6DCE4">
                    送修人名称：
                    </td>
                    <td class="style1">
                       ${user.uname}
                    </td>
                    <td class="style2" style="background-color: #F4F4F4">
                       送修部门：
                    </td>
                    <td width="20%">
		


  ${user.department.dname}

		
		<!--<s:if test="%{#asset.astate==1}">是</s:if>
	<s:else>否</s:else>
                   --></td>
                </tr>
                <tr>
                    <td width="14%" height="37px" style="background-color: #D6DCE4">
        资产ID：
                    </td>
                    <td width="19%">
                     ${asset.aid}
                    </td>
                    <td width="17%" style="background-color: #F4F4F4">
                    维修费用：
                    </td>
                    <td class="style1">
                     ${reprice}
                    </td>
                    <td class="style2" style="background-color: #D6DCE4">
                       	状态：
                    </td>
                    <td width="20%">
                    
                    
                  <!--0-维修中 1-维修完成-->          
                    
                   <c:if test="${restate==1}">
	维修完成
</c:if>
<c:if test="${restate!=1}">
	维修中
</c:if>

                    </td>
                </tr>
                <tr>
                    <td width="14%" style="height: 133px; background-color: #F4F4F4">
                   备注：
                    </td>
                    <td style="height: 133px" colspan="6">
${recondition}
                        &nbsp;&nbsp;
                    </td>
                </tr>
                
                
                
                
                  
              
                <tr>
                    <td align="center" colspan="6" height="25" nowrap="nowrap">
                        &nbsp;<font face="宋体"> <a href="javascript:history.back();"><span style="color: #0000ff;
                            text-decoration: underline">返回</span></a></font>
                    </td>
                </tr>
            </table>
	
	
	</body>
</html>
