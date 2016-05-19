<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <%@ taglib uri="/struts-tags" prefix="s" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <title>My JSP 'query_purchase.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

    <script src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js" type="text/javascript"></script>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/premium.css">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
<script>

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
  
  <body class=" theme-blue" style="width:993px">
    <h3>采购单信息</h3>
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
            height:300px;
            width:1000px;
            margin: 0px auto;
            margin-top: 1em;
        }
        th{text-align:center}
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { 
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
   <div class="main-content" style="width:993px">
       
<div class="btn-toolbar list-toolbar">
    <br/>
   <a href="jsp/purchase/create_purchase.jsp" class="btn btn-primary"><i class="fa fa-plus"></i> 增加采购单</a>
   <button class="btn btn-default">导入</button>
    <button class="btn btn-default">导出</button>
  <div class="btn-group">
  </div>
</div>
  
    <form action="" id="_form" method="post">
   <table  class="table" style="text-align:center">
     <thead  >
   <tr >
   		<th>
   		采购单id
   		</th>
  
   		<th>
   	经办人
   		</th>
   		<th>
   	采购日期
   		</th>
   		<th>
   	采购用途
   		</th>
   			<th>
   	状态
   		</th><!--
   		<th>
   	修改
   		</th>
   		
   	
   			<th>
   		删除
   		</th>	
   			--><th>
   		清单
   		</th>	
   		 <th style="width: 3.5em;"></th>
   </tr>
   
     </thead>
   
   <s:iterator id="purinfo" value="pageInfo.result" status="st">
					 <tr>
       <td>${purinfo.pnid}</td>
          
         <td>${purinfo.user.uname}</td>
         
         <td> <fmt:formatDate value="${purinfo.pndate}" pattern="yyyy-MM-dd"/></td>
         <td>${purinfo.pnuse}</td>
          <td>${purinfo.pnstate}</td><!--
      
      <td><a href="selectPurchaseById.action?pnid=${purinfo.pnid}">更新</a></td>
       <td><a href="deletePurchase.action?pnid=${purinfo.pnid}">删除</a></td>
        --><td><a href="queryPurDetail.action?pnid=${purinfo.pnid}">清单</a></td>
        <td>
          <a href="selectPurchaseById.action?pnid=${purinfo.pnid}"><i class="fa fa-pencil"></i></a>
          <a href="#myModal" role="button" data-toggle="modal"><i class="fa fa-trash-o"></i></a>
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
				 <div class="modal small fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="myModalLabel">删除确认</h3>
        </div>
        <div class="modal-body">
            <p class="error-text"><i class="fa fa-warning modal-icon"></i>确定删除采购单?</p>
        </div>
        <div class="modal-footer">
            <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">取消</button>
           <button class="btn btn-danger" data-dismiss="modal"  onclick="window.location='deletePurchase.action?pnid=${purinfo.pnid}'" > 删除</button>
        </div>
      </div>
    </div>
</div>
  
     </form>
</div>

<script src="${pageContext.request.contextPath}/lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script> 
  
  </body>
</html>
