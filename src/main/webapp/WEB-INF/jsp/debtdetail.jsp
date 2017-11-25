<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8"/>
    <title>赊账宝_待收详情页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css"/>
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
<div class="old">
    账单流水号：123456789<br/>
</div>
<div class="new">
    购&nbsp;买&nbsp;&nbsp;日&nbsp;期：2017年11月11日
</div>
<div class="new">
    商&nbsp;品&nbsp;&nbsp;名&nbsp;称：史丹利化肥1号
</div>
<div class="new">
    商&nbsp;品&nbsp;&nbsp;数&nbsp;量：2
</div>
<div class="new">
    总 &nbsp;&nbsp;&nbsp;&nbsp;金&nbsp;&nbsp;&nbsp;额：2,100.00元
</div>
<div class="new">
    应支付日期：2017年12月11日
</div>
<div class="btn">
    <br/>
    <button class="btn_cancel" id="btn" type="button" onclick="doSubmit()">标 记 已 还</button>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button class="btn_confirm btn_brown" id="btn" type="button" onclick="doSubmit()">发 起 催 收</button>
</div>
</body>
</html>
