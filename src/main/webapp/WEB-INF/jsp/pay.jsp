<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8"/>
    <title>赊账宝_支付页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css"/>

</head>
<body>
<div class="banner">
    <table>
        <tr>
            <td rowspan="3">
                <div class="to">
                    <img src="${pageContext.request.contextPath}/img/head.jpg"/>
                </div>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>
                <div class="headcontent">
                    <p>商家：永丰农业</p>
                    <p>Tel:13912345678</p>
                    <p>海南省海口市某某县某某镇某某某村</p>
                </div>
            </td>
            <td>
                <a href="tel:13764567708"><img id="callimg" src="${pageContext.request.contextPath}/img/call.png"/></a>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
    </table>
</div>
<div class="paytitle">
    <span>应付金额：</span><span style="color: #21b4ea;">2,100.00元</span><br/><br/>
    <span>请长按下方二维码进行微信转账支付</span>
</div>
<div class="payqrcode">
    <img id="#payqrcode" src="${pageContext.request.contextPath}/img/qrcode.png"/>
</div>
</body>
</html>
