<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8"/>
    <title>赊账宝_订单创建成功</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css"/>
</head>
<body>
<div class="success">
    <img src="${pageContext.request.contextPath}/img/success.png"/>
    <span>&nbsp;账单创建成功！</span>
</div>
<div class="shareimg">
    <img src="${pageContext.request.contextPath}/img/share.png"/>
</div>
<div class="paytitle">
    <span style="line-height: 1.5rem;">请将下方二维码出示给买家，买家通过扫码确认订单！或点击右上角，发送给买家确认！</span>
</div>
<div class="payqrcode">
    <img id="#payqrcode" src="${pageContext.request.contextPath}/img/qrcode.png"/>
</div>
</body>
</html>
