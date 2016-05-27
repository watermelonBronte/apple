<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<!--<form action="asset_category/test_AssetCategory_updateAssetCategory.action"
			method="post">
			
			
			-->
		
			<table align="center" border="1" cellpadding="4" cellspacing="0" width="95%"  >
               <tr align="center"><td colspan="7" style="font-family: @Adobe 宋体 Std L; font-size: 25px;background-color: #A2B5CD;color:#fff"">资产列表详情</td></tr>
               
                <tr>
                    <td width="17%" height="37px" style="background-color: #F4F4F4">
                     卡片编号：
                    </td>
                    <td colspan="6">
                      ${cid}
                    </td>
                   
                </tr>
                <tr>
                    <td width="14%" height="37px" style="background-color: #D6DCE4">
                  上级资产类别名称：
                    </td>
                    <td width="19%">
                      ${assetCategory.supacname}
                    </td>
                    <td width="12%" style="background-color: #F4F4F4">
                      入库时间：
                    </td>
                    <td width="14%">
                       ${sdate}
                    </td>
                    <td width="14%" style="background-color: #D6DCE4">
                       	是否打印标签：
                    </td>
                    <td width="20%"><!--
                     <s:if test="tprint==1">
			
			是
		
			</s:if>
		<s:else>
			
			否
			</s:else>
			
			
			 --><!--
			 
			 
			 <s:if test="%{#tprint==1}">是</s:if>
	<s:else>否</s:else>
	
	--><c:if test="${asset.tprint==1}">
是
</c:if>
<c:if test="${asset.tprint!=1}">
否
</c:if>
	
			
                    </td>
                </tr>
                
                <tr>
                    <td width="14%" height="37px" style="background-color: #F4F4F4">
                      资产ID：
                    </td>
                    <td width="19%">
                      ${aid}
                    </td>
                    <td width="17%" style="background-color: #D6DCE4">
                       使用人名称：
                    </td>
                    <td class="style1">
                       ${user.uname}
                    </td>
                    <td class="style2" style="background-color: #F4F4F4">
                       	入库状态：
                    </td>
                    <td width="20%"><!--
                      <s:if test="finance.astate==1">
			
			是
		
		</s:if>
		<s:else>
			
			否
		</s:else> -->
		
<c:if test="${asset.astate==1}">
是
</c:if>
<c:if test="${asset.astate!=1}">
否
</c:if>




		
		<!--<s:if test="%{#asset.astate==1}">是</s:if>
	<s:else>否</s:else>
                   --></td>
                </tr>
                <tr>
                    <td width="14%" height="37px" style="background-color: #D6DCE4">
                   一维码路径：
                    </td>
                    <td width="19%">
                      ${onepath}
                    </td>
                    <td width="17%" style="background-color: #F4F4F4">
                     二维码路径：
                    </td>
                    <td class="style1">
                       ${twopath}
                    </td>
                    <td class="style2" style="background-color: #D6DCE4">
                       	条码：
                    </td>
                    <td width="20%">
                     ${barcode}
                    </td>
                </tr>
                <tr>
                    <td width="14%" style="height: 133px; background-color: #F4F4F4">
                   备注：
                    </td>
                    <td style="height: 133px" colspan="6">
 ${anote}
                        &nbsp;&nbsp;
                    </td>
                </tr>
                
                
                
                 <tr align="center"><td colspan="7" style="font-family: @Adobe 宋体 Std L; font-size: 25px;background-color: #A2B5CD;color:#fff">财物入账单</td></tr>
                <tr>
                    <td width="17%" height="37px" style="background-color: #D6DCE4">
                  财务编码：
                    </td>
                    <td colspan="6">
                      ${finance.fcode}
                    </td>
                   
                </tr>
                <tr>
                    <td width="14%" height="37px" style="background-color: #F4F4F4">
财务入账人名称：
                    </td>
                    <td width="19%">
                     ${finance.user.uname}
                    </td>
                    <td width="17%" style="background-color: #D6DCE4">
                   是否入账：
                    </td>
                    <td class="style1">
                    
                    <c:if test="${finance.fenter==1}">
是
</c:if>
<c:if test="${finance.fenter!=1}">
否
</c:if>
                    
                    
                     <!--<s:if test="%{#finance.fenter==1}">
			
			是
		
		</s:if>
		<s:else>
			
			否
		</s:else>
		
		
                    --></td>
                    <td class="style2" style="background-color: #F4F4F4">
                       	入账时间：
                    </td>
                    <td width="20%">
                    ${sfdate}
                    </td>
                </tr>
                
                  <tr align="center"><td colspan="7" style="font-family: @Adobe 宋体 Std L; font-size: 25px;background-color: #A2B5CD;color:#fff"">采购清单</td></tr>
                  <tr>
                    <td width="15%" height="37px" style="background-color: #F4F4F4">
                    资产名称：
                    </td>
                    <td width="25%">
                        ${purchaseDetail.aname}
                    </td>
                    <td width="15%" style="background-color: #D6DCE4">
                        资产型号：
                    </td>
                    <td width="35%" colspan="4">
                       ${purchaseDetail.atype}
                    </td>
                  
                </tr>
                
                
                
                <tr>
                    <td width="14%" height="37px" style="background-color:#D6DCE4">
                  数量：
                    </td>
                    <td width="19%">
                    ${purchaseDetail.pdcount}
                    </td>
                    <td width="17%" style="background-color: #F4F4F4">
                     单位：
                    </td>
                    <td class="style1">
                     ${purchaseDetail.pdunit}
                    </td>
                    <td class="style2" style="background-color: #D6DCE4">
                       	单价：
                    </td>
                    <td width="20%">
                     ${purchaseDetail.pdprice}
                    </td>
                </tr>
                
                
                
                  <tr>
                    <td width="15%" height="37px" style="background-color: #F4F4F4">
                      制造商：
                    </td>
                    <td width="25%">
                       ${purchaseDetail.pdmarker}
                    </td>
                    <td width="15%" style="background-color:#D6DCE4">
                   提供商：
                    </td>
                    <td width="35%" colspan="4">
                        ${purchaseDetail.pdprovider}
                    </td>
                  
                </tr>
                <tr>
                    <td align="center" colspan="6" height="25" nowrap="nowrap">
                        &nbsp;<font face="宋体"> <a href="javascript:history.back();"><span style="color: #0000ff;
                            text-decoration: underline">返回</span></a></font>
                    </td>
                </tr>
            </table><!--
            
            
            
            <hr />
		<h3>
			采购清单
		</h3>
		资产名称
		<input type="text" name="purchaseDetail.aname"
			value="${purchaseDetail.aname}" />
		<br />
		资产型号
		<input type="text" name="purchaseDetail.atype"
			value="${purchaseDetail.atype}" />
		<br />
		数量
		<input type="text" name="purchaseDetail.pdcount"
			value="${purchaseDetail.pdcount}" />
		<br />
		单位
		<input type="text" name="purchaseDetail.pdunit"
			value="${purchaseDetail.pdunit}" />
		<br />
		单价
		<input type="text" name="purchaseDetail.pdprice"
			value="${purchaseDetail.pdprice}" />
		<br />
		制造商
		<input type="text" name="purchaseDetail.pdmarker"
			value="${purchaseDetail.pdmarker}" />
		<br />
		提供商
		<input type="text" name="purchaseDetail.pdprovider"
			value="${purchaseDetail.pdprovider}" />
		<br />		
		
		<a href="asset/asset_Asset_pageAsset.action">返回</a>			
		--><!--<input type="submit" value="更新" />
		</form>

 
	-->
	</body>
</html>
