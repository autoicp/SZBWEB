<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<meta charset="utf-8" />
		<title>赊账宝_记账</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" />

		<body>
			<form id="accountform" method="post" action="${pageContext.request.contextPath}/record/accountdo">
				<div class="old box_app">
					<span>账单流水号：<span style="color:#99999b;">201711111234567890000</span></span><br />
				</div>
				<div class="new  box_app">
					<span>商&nbsp;品&nbsp;&nbsp;名&nbsp;称：</span><input type="text" id="productName" name="productName" placeholder="请输入商品名称" />
				</div>
				<div class="new  box_app">
					<span>商&nbsp;品&nbsp;&nbsp;数&nbsp;量：</span><input type="text" id="productCounts" name="productCounts" placeholder="请输入商品数量" />
				</div>
				<div class="new  box_app">
					<span>总 &nbsp;&nbsp;&nbsp;&nbsp;金&nbsp;&nbsp;&nbsp;额：</span><input id="productAmount" name="productAmount" type="text" placeholder="请输入总金额" />
				</div>
				<div class="new  box_app">
					<span>归&nbsp;还&nbsp;&nbsp;日&nbsp;期：</span>
					<!-- <span class="datespan">三个月</span>&nbsp;
					<span class="datespan">六个月</span>&nbsp;
					<span class="datespan">一年</span><br/><br/><br/> 
					<span class="datespan">其它日期:<input id="beginTime" class="kbtn" type="text" placeholder="请选择日期" /></span>-->
					<input id="paydate" class="kbtn" type="text" placeholder="请选择日期" name="duePayDate"/>
					<div id="datePlugin"></div>
				</div>
				<div class="btn">
					<br/>
					<button class="btn_app btn_brown" id="btn" type="button" onclick="doSubmit()">提         交</button>
				</div>
				<input type="hidden" name=" " value="" />
				<input type="hidden" name=" " value="" />
				<input type="hidden" name=" " value="" />
			</form>
			<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
			<script type="text/javascript" src="${pageContext.request.contextPath}/js/date.js"></script>
			<script type="text/javascript" src="${pageContext.request.contextPath}/js/scroll.js"></script>
			<script>
				$(function() {
					$('#paydate').date();
				});
				$(".datespan").on("click", function() {
					$(".datespan").removeClass("datespanclick");
					$(this).addClass("datespanclick");
				});

				function doSubmit() {
					var sub = "true";
					//验证
					var productName = $.trim($("#productName").val());
					if(productName == "") {
						$("#productName").val("");
						$("#productName").attr("placeholder", "姓名输入错误");
						$("#productName").addClass("invalid");
						sub = "false";
					}
					var numReg = /^\d{1,9}$/;
					var num = $.trim($("#productCounts").val());
					if("" == num || !numReg.test(num)) {
						$("#productCounts").val("");
						$("#productCounts").attr('placeholder', '数量输入有误');
						$("#productCounts").addClass("invalid");
						sub = "false";
					}
					var amountReg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
					var amount = $.trim($("#productAmount").val());
					if(amount == "" || !amountReg.test(amount)) {
						$("#productAmount").val("");
						$("#productAmount").attr('placeholder', '金额输入有误');
						$("#productAmount").addClass("invalid");
						sub = "false";
					}
					
					var paydate=$.trim($("#paydate").val());
					if(paydate==""){
						$("#paydate").val("");
						$("#paydate").attr('placeholder', '请选择归还日期');
						$("#paydate").addClass("invalid");
						sub = "false";
					}
					if(sub == "true") {
						$("#accountform").submit();
					}
				}
			</script>
		</body>

</html>
