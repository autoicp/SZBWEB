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
    <span>&nbsp;账单确认成功！</span>
</div>
<div class="shareimg">

</div>
<div class="paytitle">
    <span style="line-height: 1.5rem;">先拿货，后付款的诚信买卖就在“赊账宝”！</span>
</div>
<br/><br/><br/>
<div class="buslist">
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
                &nbsp;&nbsp;
            </td>
            <td>
                <div>
                    <span>永丰农业  共 <span style="color: #21b4ea;">2,100.00</span> 元</span><br/>
                    <span>史丹利化肥：2</span><br/>
                    <span>应于 <span style="color: #21b4ea;">2018年11月11日</span> 还款</span>
                </div>
            </td>

        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
    </table>
</div>
</body>

</html>