<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="utf-8"/>
    <title>赊账宝_订单确认页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css"/>

<body>
<form id="accountform" method="get" action="accountsuccess.html">
    <div class="old box_app">
        <span>账单流水号：<span style="color:#99999b;">201711111234567890000</span></span><br/>
    </div>
    <div class="new  box_app">
        <span>购&nbsp;买&nbsp;&nbsp;日&nbsp;期：2017年11月11日</span>
    </div>
    <div class="new  box_app">
        <span>商&nbsp;品&nbsp;&nbsp;名&nbsp;称：史丹利化肥1号</span>
    </div>
    <div class="new  box_app">
        <span>商&nbsp;品&nbsp;&nbsp;数&nbsp;量：1</span>
    </div>
    <div class="new  box_app">
        <span>总 &nbsp;&nbsp;&nbsp;&nbsp;金&nbsp;&nbsp;&nbsp;额：2,100.00元</span>
    </div>
    <div class="new  box_app">
        <span>应付款日期：2018年11月11日</span>

    </div>
    <div class="btn">
        <br/>
        <button class="btn_cancel" id="btn" type="button" onclick="doSubmit()">取消订单</button>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button class="btn_confirm btn_brown" id="btn" type="button" onclick="doSubmit()">确认订单</button>
    </div>
</form>
</body>

</html>