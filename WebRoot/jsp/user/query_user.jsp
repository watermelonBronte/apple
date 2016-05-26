<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html  >
  <head>
    <base href="<%=basePath%>">
    
    <title>用户管理</title>
      <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

    <link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">

    <script src="${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js" type="text/javascript"></script>




<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.reveal.js"></script>





    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/premium.css">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
 
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
var va;
 function text1(va1){//获取当前id
 va=va1;
        }
 function del1(){//改变url
 	dataP="deleteUser.action?uid="+va;
 	 window.location.href=encodeURI(dataP);
 }
</script>
<style type="text/css">

body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体";}

</style>
</head>
  
  <body class=" theme-blue" style="width:993px">
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
   <a href="#myModal1"  role="button" data-toggle="modal" class="btn btn-primary"><i class="fa fa-plus"></i> 增加用户</a><!-- 
    <button class="btn btn-primary"><i class="fa fa-plus"></i> 增加用户</button>
    --><!--<button class="btn btn-default">导入</button>
    <button class="btn btn-default">导出</button>
  --><div class="btn-group">
  </div>
</div>
  
   <form action="" id="_form" method="post"><!--alert(parseInt(userinfor.value)) -->
  根据用户id查询：<input id="userinfor" type="text"  value="" name="user.uid" />
  <a href="selectUserId.action?id=3"> 查询</a>
   <table id="charcolor" class="table" style="text-align:center">
  <thead  >
    <tr>
   		<th >
   		用户ID
   		</th>
   	<th>
   		角色名称
   		</th>
   			<th>
   		部门名称
   		</th>
   			<th>
   		用户名
   		</th>
   			<!--<th>
   		密码
   		</th>
   		
   			--><th>
   		性别
   		</th>
   			<th>
   		用户状态
   		</th>
   		 <th style="width: 3.5em;"></th>
   			<!--<th>
   		修改
   		</th>
   			<th>
   		删除
   		</th>
   --></tr>
   </thead>
<s:iterator id="userinfo" value="pageInfo.result" status="st">
 <tbody>
					 <tr>
       <td>${userinfo.uid}</td>   
         <td>${userinfo.role.rname}</td>  
         <td>${userinfo.department.dname}</td>  
       <td>${userinfo.uname}</td><!--  
      <td>${userinfo.upwd}</td> 
      -->
      <td>
      <s:if test="%{#userinfo.usex==1}">女</s:if>
	<s:else>男</s:else>
	</td> 
  
      <td>
          <s:if test="%{#userinfo.ustate==1}">正常</s:if>
	<s:else>禁用</s:else>
    
      
      </td>
      
       <td>
          <a href="selectUserById.action?uid=${userinfo.uid}"><i class="fa fa-pencil"></i></a>
          <a  href="#myModal" onclick="text1(${userinfo.uid})" role="button" data-toggle="modal"><i class="fa fa-trash-o"></i></a>
      </td><!--
      
      
      <td><a href="selectUserById.action?uid=${userinfo.uid}">更新</a></td>
       <td><a href="deleteUser.action?uid=${userinfo.uid}">删除</a></td>
       --></tr>
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
 </tbody>
 </table>


 

  
  <div class="modal small fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="myModalLabel">删除确认</h3>
        </div>
        <div class="modal-body">
            <p class="error-text"><i class="fa fa-warning modal-icon"></i>确定删除用户?</p>
        </div>
        <div class="modal-footer">
            <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">取消</button>
           <button class="btn btn-danger" data-dismiss="modal" onclick="del1()"  > 删除</button>
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
    
    
    
    
    
    
     
  <div class="modal small fade "   id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
  <div class="modal-dialog " style="width:550px">
    <div class="modal-content" style="background:#eee url(${pageContext.request.contextPath}/images/modal-gloss.png) no-repeat -200px -80px;position:absolute;z-index:101;padding:5px 10px 7px;-moz-border-radius:5px;-webkit-border-radius:5px;border-radius:5px;-moz-box-shadow:0 0 10px rgba(0,0,0,.4);-webkit-box-shadow:0 0 10px rgba(0,0,0,.4);-box-shadow:0 0 10px rgba(0,0,0,.4);">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
         <h2 style="height:20px;margin-top:10px; font-weight: 600; color:#990000">添加用户</h2>
        </div>
         <form action="createUser.action" method="post">
        <div class="modal-body">
           
 <table  cellSpacing="0"  cellPadding="8" align="center" style="text-align:center"><tr>
 
 
 <td  style="height:40px;width:75px;text-align:left"> 用户名：</td>
 <td  style="height:40px;width:140px;text-align:left"><input type="text" name="uname" class="input" size="12" />
 </td>
 <td style="height:40px;width:75px;text-align:left">密码：</td>
 <td style="height:40px;width:140px;text-align:left"><input type="password" name="upwd"  size="12" /></td></tr>
 
 
 
 
 <tr><td  >   部门名称：</td><td style="text-align:left" ><!--
 
 <input type="text" name="usex"  />
    -->
 <s:select list="DepartmentList" listKey="did" listValue="dname"
				name="department.did"  />
 
 </td><td style="text-align:left" >
   角色名称: </td><td style="text-align:left">
   
   <!-- <input type="text" name="user.role.rid" />  -->

<s:select list="roleList" listKey="rid" listValue="rname"
				name="role.rid"    />

 </td></tr>
 <tr><td style="height:40px;text-align:left ">   
   性别：</td><td style="text-align:left"><!--
    <input type="text" name="user.department.did"  />
    -->
    
    
    
    
    
    <select name="usex"  style="width:70px;">
  <option value ="1">女</option>
  <option value ="0">男</option>
 
</select>
    </td><td style="text-align:left">
   
         状态：</td><td style="text-align:left">
         
   
     <select name="ustate" style="width:70px;" >
  <option value ="1">正常</option>
  <option value ="0">禁用</option>
 
</select>
   
         <br/>
    </td></tr>
    <tr style="height:25px;"><td></td></tr>
 <tr style="border-top: 1px solid #e5e5e5;  " ><td colspan="2"  align="right">  <br/><input  class="btn btn-danger" type="submit"  value="提交"/></td>
 
 <td colspan="2" align="left">  <br/><button style="margin:10px;" class="btn btn-default" data-dismiss="modal" aria-hidden="true">取消</button></td>
 </tr>
 
  </table>

        </div>
  
       
         </form>
      </div>
    </div>
</div> 
    







    
   
   
</body>
</html>
