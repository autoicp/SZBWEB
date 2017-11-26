<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="utf-8"/>
    <title>赊账宝_个人中心</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css"/>

<body>
<div class="banner">
    <table>
        <tr>
            <td rowspan="2">
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
                    <h1>昵称</h1>
                </div>
            </td>
            <td>
                &nbsp;
            </td>
        </tr>
    </table>
</div>
<div class="new">
</div>
<form id="userform" method="post" action="${pageContext.request.contextPath}/user/usercenterdo" enctype="multipart/form-data">
    <div class="new box_app">
        <img src="${pageContext.request.contextPath}/img/usernameico.png"/>
        <span>&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</span><input id="userName" type="text"
                                                                                                 placeholder="请输入您的姓名" name="userName"/>
    </div>
    <div class="new box_app">
        <img src="${pageContext.request.contextPath}/img/telico.png"/>
        <span>&nbsp;电&nbsp;话&nbsp;号&nbsp;码：</span><input id="userTelphone" type="text" placeholder="请输入您的手机号码" name="telephone"/>
    </div>
    <div class="new box_app">
        <img src="${pageContext.request.contextPath}/img/companyico.png"/>
        <span>&nbsp;公&nbsp;司&nbsp;名&nbsp;称：</span><input id="companyName" type="text" placeholder="请输入您的公司名称/店铺名称" name="shopName"/>
    </div>
    <div class="new box_app">
        <img src="${pageContext.request.contextPath}/img/addrico.png"/>
        <span>&nbsp;地 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：</span><input id="companyAddr" type="text"
                                                                                            placeholder="请输入您的地址" name="shopAddress"/>
    </div>
    <div class="new box_app">
        <img src="${pageContext.request.contextPath}/img/qrcodeico.png"/>
        <span>&nbsp;收&nbsp;&nbsp;&nbsp;钱&nbsp;&nbsp;&nbsp;码：</span>
        <div class="qrcodeico" id="addqrcode" >
            <img src="${pageContext.request.contextPath}/img/addqrcode.png"/><br/><br/>
            <span>添加收钱码</span>
        </div>
    </div>

    <div class="btn">
        <br/>
        <button class="btn_app btn_brown" id="btn" type="button" onclick="doSubmit()">完 成</button>
    </div>
    <input type="hidden" name=" " value=""/>
    <input type="hidden" name=" " value=""/>
    <input type="hidden" name=" " value=""/>
    <input id="qrcodefile" type="file" accept="image/*;capture=camera" name="qrCode">

</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
<script>
    $(function(){
        $("#qrcodefile").hide();
    });
    $("#addqrcode").on("click",function(){
        $("#qrcodefile").click();
    });
    function doSubmit() {
        //验证
        var sub = "true";
        var userName = $.trim($("#userName").val());
        if(userName == "") {
            $("#userName").val("");
            $("#userName").attr("placeholder", "姓名输入错误");
            $("#userName").addClass("invalid");
            sub = "false";
        }
        var mobileReg=/^1[34578]\d{9}$/;
        var mobile = $.trim($("#userTelphone").val());
        if("" == mobile || !mobileReg.test(mobile)) {
            $("#userTelphone").val("");
            $("#userTelphone").attr('placeholder', '手机号码输入有误');
            $("#userTelphone").addClass("invalid");
            sub = "false";
        }
        var companyName = $.trim($("#companyName").val());
        if(companyName == "") {
            $("#companyName").val("");
            $("#companyName").attr("placeholder", "公司名称输入错误");
            $("#companyName").addClass("invalid");
            sub = "false";
        }
        var companyAddr = $.trim($("#companyAddr").val());
        if(companyAddr == "") {
            $("#companyAddr").val("");
            $("#companyAddr").attr("placeholder", "地址输入错误");
            $("#companyAddr").addClass("invalid");
            sub = "false";
        }
        if(sub == "true") {
            $("#userform").submit();
        }
    }
</script>

</body>

</html>