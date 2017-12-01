<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@page import="java.sql.Timestamp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>个人中心</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>

<h1>个人中心</h1> <br>
<c:forEach var="record" items="${records}">
    商品名称：${record.productName }<br/>
    商品总金额：${record.productAmount }<br/>
    账目发生时间：${record.occurTime } <br/>
    应还款日：${record.duePayDate }<br/>
</c:forEach>

<input type="button" value="完成">


</body>
</html>
